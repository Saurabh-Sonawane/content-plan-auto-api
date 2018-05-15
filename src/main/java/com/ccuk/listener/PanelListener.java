package com.ccuk.listener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.ccuk.model.ContentPlan;
import com.ccuk.model.Panel;
import com.ccuk.repository.ContentPlanFilterRepository;
import com.ccuk.services.ContentPlanFilterFacade;

@Component
@PropertySource("classpath:application.properties")
public class PanelListener {
	
	@Autowired
    private ContentPlanFilterFacade contentPlanFilterFacade;
	
	@Autowired
	private ContentPlanFilterRepository contentPlanFilterRepository;
	
	private static final Logger log = LoggerFactory.getLogger(PanelListener.class);
	
	
	@RabbitListener(queues = "${spring.rabbitmq.queuename}")
	public void receiveMessage(final Panel panel) throws IOException {
		List<ContentPlan> filteredCP = new ArrayList<>();		
        log.info("Received <" + panel.toString() + ">");
        filteredCP = contentPlanFilterFacade.searchContentPlans(panel);
        contentPlanFilterRepository.save(filteredCP);
        log.info("Message processed... <" + filteredCP.toString() + ">");
}
}
