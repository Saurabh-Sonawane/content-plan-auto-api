package com.ccuk.repository;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ccuk.model.ContentPlan;
import com.ccuk.model.ContentPlanSearch;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ContentPlanFilterRepositoryTest {
	
    @Autowired
    private MongoTemplate mongoTemplate;

	@Autowired
	private ContentPlanFilterRepository contentPlanFilterRepositoryMock;


	 @Test
	    public void testSearchContentPlans() throws Exception {
		 
		    mongoTemplate.dropCollection(ContentPlan.class);
			ContentPlan contentPlan = getDummyContentPlanDetails();
			mongoTemplate.save(contentPlan);
			
	        // when
	        List<ContentPlanSearch> contentPlans = contentPlanFilterRepositoryMock.searchContentPlans();
	        // then
	        assertNotNull(contentPlans);
	    }
	
	
	private ContentPlan getDummyContentPlanDetails() {
        PodamFactory factory = new PodamFactoryImpl();
        ContentPlan contentPlan = factory.manufacturePojo(ContentPlan.class);
        return contentPlan;
    }
}
