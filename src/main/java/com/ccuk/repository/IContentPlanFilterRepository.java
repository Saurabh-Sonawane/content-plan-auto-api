package com.ccuk.repository;

import java.util.List;

import com.ccuk.model.ContentPlan;
import com.ccuk.model.ContentPlanSearch;


public interface IContentPlanFilterRepository {
	void save(List<ContentPlan> filteredContentPlan);
	List<ContentPlanSearch> searchContentPlans();
	ContentPlan getContentPlanById(String contentPlanId);
}
