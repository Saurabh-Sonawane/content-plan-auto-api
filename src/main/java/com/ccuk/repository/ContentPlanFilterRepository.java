package com.ccuk.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.aggregation.SortOperation;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import com.ccuk.model.ContentPlan;
import com.ccuk.model.ContentPlanSearch;
import com.ccuk.model.Panel;
import com.ccuk.model.enums.ContentPlanStatus;

@Repository
public class ContentPlanFilterRepository implements IContentPlanFilterRepository {
    @Autowired
    private MongoTemplate mongoTemplate;
    
    private static final Logger logger = LoggerFactory.getLogger(ContentPlanFilterRepository.class);
    
    public ContentPlan getContentPlanById(String contentPlanId) {

    	logger.info(" Inside ContentPlanRepository getContentPlanById, performing aggregation to fetch schedule for contentPlanId {}", contentPlanId);
        AggregationOperation match = Aggregation.match(Criteria.where("_id").is(new ObjectId(contentPlanId)));
        AggregationOperation lookup = Aggregation.lookup("schedule", "_id", "contentPlanId", "scheduleList");

        Aggregation aggregation = Aggregation.newAggregation(match, lookup);
        AggregationResults<ContentPlan> output = mongoTemplate.aggregate(aggregation, ContentPlan.class,
                ContentPlan.class);
        return output.getUniqueMappedResult();
    }
    
    public List<ContentPlanSearch> searchContentPlans() {

    	logger.info(" Inside ContentPlanRepository search contentPlans");
        Aggregation aggregation = Aggregation.newAggregation(getMatchOperation(), getSortOperation(),
                getGroupOperation(), getProjectOperation());
        AggregationResults<ContentPlanSearch> output = mongoTemplate.aggregate(aggregation, "contentplan",
                ContentPlanSearch.class);
        return output.getMappedResults();
    }

    private MatchOperation getMatchOperation() {

    	logger.info(" Inside ContentPlanRepository getMatchOperations with filter {}", new Date());
        Criteria searchCriteria = new Criteria();
        List<Criteria> andCriterias = new ArrayList<>();
        andCriterias.add(Criteria.where("status").ne(ContentPlanStatus.ARCHIVED.name()));
        andCriterias.add(Criteria.where("endDate").gte(new Date()));

        return Aggregation.match(searchCriteria.andOperator(andCriterias.toArray(new Criteria[andCriterias.size()])));
    }
    
    private SortOperation getSortOperation() {
        Sort sort = new Sort(Sort.Direction.DESC, "version");
        return Aggregation.sort(sort);
    }

    private GroupOperation getGroupOperation() {
        return Aggregation.group("contractNumber")
                /*
				 * .first("contractNumber").as("contractNumber")
				 * .first("version").as("version")
				 * .first("customerName").as("customerName");
				 */
                .first(Aggregation.ROOT).as("contentPlan");
    }

    private ProjectionOperation getProjectOperation() {
        return Aggregation.project("contentPlan").and("contractNumber").previousOperation();
    }
	public void save(List<ContentPlan> filteredContentPlan) {
		for (ContentPlan contentPlan : filteredContentPlan) {
			mongoTemplate.save(contentPlan,"filteredcontentplan");
		}
	}
}
