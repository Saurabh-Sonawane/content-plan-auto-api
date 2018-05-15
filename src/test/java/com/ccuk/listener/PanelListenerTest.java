package com.ccuk.listener;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ccuk.model.ContentPlan;
import com.ccuk.model.Panel;
import com.ccuk.repository.ContentPlanFilterRepository;
import com.ccuk.services.ContentPlanFilterFacade;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@RunWith(MockitoJUnitRunner.class)
public class PanelListenerTest {
	
	@InjectMocks
	private PanelListener panelListener;
	
	@Mock
	private ContentPlanFilterFacade contentPlanFilterFacade;
	
	@Mock
	private ContentPlanFilterRepository contentPlanFilterRepository;
	
	 @Test
	    public void testReceiveMessage() throws Exception {
	        //given
	    	 Panel panel = getDummyPanelDetails();
	    	 
	    	 ContentPlan contentPlanObj1 = getDummyContentPanelDetails();
	    	 List<ContentPlan> filteredCP =  new ArrayList<>();	
	    	 contentPlanObj1.setBrandId("1234");
	    	 contentPlanObj1.setBrand("NewPanel");
	    	 filteredCP.add(contentPlanObj1);

	    	 when(contentPlanFilterFacade.searchContentPlans(panel)).thenReturn(filteredCP);
	    	 
	        //when
	    	 panelListener.receiveMessage(panel);

	        //then
	        verify(contentPlanFilterRepository, times(1)).save(filteredCP);
	    }
	    
	    
	    private Panel getDummyPanelDetails() {
	        PodamFactory factory = new PodamFactoryImpl();
	        Panel panel = factory.manufacturePojo(Panel.class);
	        return panel;
	    }
	    
	    
	    private ContentPlan getDummyContentPanelDetails() {
	        PodamFactory factory = new PodamFactoryImpl();
	        ContentPlan contentPlan = factory.manufacturePojo(ContentPlan.class);
	        return contentPlan;
	    }
}
