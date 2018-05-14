package com.ccuk.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccuk.model.ContentPlan;
import com.ccuk.model.ContentPlanSearch;
import com.ccuk.model.Location;
import com.ccuk.model.Panel;
import com.ccuk.model.Schedule;
import com.ccuk.model.enums.LocationScheduleType;
import com.ccuk.model.enums.LocationType;
import com.ccuk.repository.ContentPlanFilterRepository;
//import com.ccuk.resources.ContentPlanFilterResource;
import com.ccuk.listener.PanelListener;

@Service
public class ContentPlanFilterFacade {

	private static final Logger logger = LoggerFactory.getLogger(PanelListener.class);

	@Autowired
	private ContentPlanFilterRepository contentPlanfliterRepository;

	public List<ContentPlan> searchContentPlans(Panel panel) {

		logger.info(" Inside ContentPlanFilterFacade : Datefilter : {} ", "");

		List<ContentPlanSearch> contentPlanList = new ArrayList<>();
		List<ContentPlan> result = new ArrayList<>();
		List<Schedule> scheduleList = null;
		List<Schedule> filteredScheduleList = null;
		List<Location> specificLoc = null;
		String TV_AREA_ID= panel.getTvAreaId();
		String ASDA_STORE_NO = panel.getShoppingMallId();
		String DISTRICT_ID = panel.getDistrictId();
		String FRAME_ID = panel.getFrameId();
		String PANEL_ID = panel.getPanelId().toString();
		
		contentPlanList = contentPlanfliterRepository.searchContentPlans();
		for (ContentPlanSearch contentPlanSearch : contentPlanList) {
			scheduleList = new ArrayList<>();
			String contentPlanId = contentPlanSearch.getContentPlan().getId();
			ContentPlan cpSchedule = contentPlanfliterRepository
					.getContentPlanById(contentPlanId);
			if (contentPlanId.equals(cpSchedule.getId())) {
				scheduleList = cpSchedule.getScheduleList();
				filteredScheduleList = new ArrayList<>();
				for (Schedule schedule : scheduleList) {				
					if (schedule.getLocationScheduleType().equals(LocationScheduleType.ALL_LOCATIONS)) {
						filteredScheduleList.add(schedule);
					}
					else
					{
						Map<LocationType, List<Location>> specificLoctyp = schedule.getSelectedLocations();
						if(specificLoctyp.containsKey(LocationType.DISTRICT))
						{
							specificLoc = specificLoctyp.get(LocationType.DISTRICT);
							for (Location location : specificLoc) {
								if(location.getId().equals(DISTRICT_ID))
								{
									filteredScheduleList.add(schedule);
								}
							}
						}
						else if(specificLoctyp.containsKey(LocationType.ASDA_STORE_NO))
						{
							specificLoc = specificLoctyp.get(LocationType.ASDA_STORE_NO);
							for (Location location : specificLoc) {
								if(location.getId().equals(ASDA_STORE_NO))
								{
									filteredScheduleList.add(schedule);
								}
							}
						}
						else if(specificLoctyp.containsKey(LocationType.TV_AREA))
						{
							specificLoc = specificLoctyp.get(LocationType.TV_AREA);
							for (Location location : specificLoc) {
								if(location.getId().equals(TV_AREA_ID))
								{
									filteredScheduleList.add(schedule);
								}
							}
						}
						else if(specificLoctyp.containsKey(LocationType.FRAME))
						{
							specificLoc = specificLoctyp.get(LocationType.FRAME);
							for (Location location : specificLoc) {
								if(location.getId().equals(FRAME_ID))
								{
									filteredScheduleList.add(schedule);
								}
							}
						}
						else if(specificLoctyp.containsKey(LocationType.PANEL_ID))
						{
							specificLoc = specificLoctyp.get(LocationType.PANEL_ID);
							for (Location location : specificLoc) {
								if(location.getId().equals(PANEL_ID))
								{
									filteredScheduleList.add(schedule);
								}
							}
						}
					}
				}
				contentPlanSearch.getContentPlan().setScheduleList(filteredScheduleList);
				result.add(contentPlanSearch.getContentPlan());
			}
		}
		return result;
	}

}
