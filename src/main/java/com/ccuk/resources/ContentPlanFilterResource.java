/*package com.ccuk.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ccuk.model.ContentPlan;
import com.ccuk.model.Panel;
import com.ccuk.repository.ContentPlanFilterRepository;
import com.ccuk.services.ContentPlanFilterFacade;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/content-plan-auto-api")
public class ContentPlanFilterResource {
	private static final Logger logger = LoggerFactory.getLogger(ContentPlanFilterResource.class);
	
    @Autowired
    private ContentPlanFilterFacade contentPlanFilterFacade;
	@Autowired
	private ContentPlanFilterRepository contentPlanFilterRepository;
	
    @ApiOperation(value = "Get all Filtered Content Plans")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Filtered CPs successfully retrieved"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")}
    )
    @RequestMapping(value = "/filteredCPs", method = RequestMethod.POST)
    public ResponseEntity<?> getFilteredCPs(@RequestBody Panel panel)
 {
    	logger.info(" Inside ContentPlanFilterResource getFilteredCPs");
    	List<ContentPlan> CPs= contentPlanFilterFacade.searchContentPlans(panel);
    	contentPlanFilterRepository.save(CPs);
    	logger.info(" Inside ContentPlanFilterResource getFilteredCPs : count : {}", CPs != null ? CPs.size() : 0);
    	return new ResponseEntity<List<ContentPlan>>(CPs, HttpStatus.OK);

    }
}
*/