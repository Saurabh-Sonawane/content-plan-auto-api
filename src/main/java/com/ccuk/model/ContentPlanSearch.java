package com.ccuk.model;

public class ContentPlanSearch {
	
	private String contractNumber;
	private ContentPlan contentPlan;
	
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public ContentPlan getContentPlan() {
		return contentPlan;
	}
	public void setContentPlan(ContentPlan contentPlan) {
		this.contentPlan = contentPlan;
	}
	@Override
	public String toString() {
		return "ContentPlanSearch [contractNumber=" + contractNumber + ", contentPlan=" + contentPlan + "]";
	}
	 
	 
}
