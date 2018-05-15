package com.ccuk.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection="panel")
public class Panel{

	private String id;
	
	private Integer panelId;
	
	private Integer digitalUnitId;
	
	private String panelKey;
	
	private String districtId;
	
	private String districtName;
	
	@JsonFormat(pattern="dd/MM/yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date inCharge;
	
	@JsonFormat(pattern="dd/MM/yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date outOfCharge;
	
	private String addressId; 
	
	private String addressName;   
	
	private String postCode;
	
	private String panelTypeCode;
	
	private String panelType;
	
	private String panelPosition;
	
	private String orient;
	
	private String shoppingMallId;
	
	private String shoppingMallName;
	
	private String outChargeId;
	
	private String outChargeReason;
	
	private String tvAreaId;
	
	private String tvAreaName;
	
	private String longitude;
	
	private String lattitude;
	
	private String frameId;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Date getInCharge() {
		return inCharge;
	}

	public void setInCharge(Date inCharge) {
		this.inCharge = inCharge;
	}

	public Date getOutOfCharge() {
		return outOfCharge;
	}

	public void setOutOfCharge(Date outOfCharge) {
		this.outOfCharge = outOfCharge;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPanelTypeCode() {
		return panelTypeCode;
	}

	public void setPanelTypeCode(String panelTypeCode) {
		this.panelTypeCode = panelTypeCode;
	}

	public String getPanelType() {
		return panelType;
	}

	public void setPanelType(String panelType) {
		this.panelType = panelType;
	}

	public String getPanelPosition() {
		return panelPosition;
	}

	public void setPanelPosition(String panelPosition) {
		this.panelPosition = panelPosition;
	}

	public String getOrient() {
		return orient;
	}

	public void setOrient(String orient) {
		this.orient = orient;
	}

	public String getShoppingMallId() {
		return shoppingMallId;
	}

	public void setShoppingMallId(String shoppingMallId) {
		this.shoppingMallId = shoppingMallId;
	}

	public String getShoppingMallName() {
		return shoppingMallName;
	}

	public void setShoppingMallName(String shoppingMallName) {
		this.shoppingMallName = shoppingMallName;
	}

	public String getOutChargeReason() {
		return outChargeReason;
	}

	public void setOutChargeReason(String outChargeReason) {
		this.outChargeReason = outChargeReason;
	}
	
	public String getTvAreaId() {
		return tvAreaId;
	}

	public void setTvAreaId(String tvAreaId) {
		this.tvAreaId = tvAreaId;
	}

	public String getTvAreaName() {
		return tvAreaName;
	}

	public void setTvAreaName(String tvAreaName) {
		this.tvAreaName = tvAreaName;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLattitude() {
		return lattitude;
	}

	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}

	public Integer getPanelId() {
		return panelId;
	}

	public void setPanelId(Integer panelId) {
		this.panelId = panelId;
	}

	public String getPanelKey() {
		return panelKey;
	}

	public void setPanelKey(String panelKey) {
		this.panelKey = panelKey;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getOutChargeId() {
		return outChargeId;
	}

	public void setOutChargeId(String outChargeId) {
		this.outChargeId = outChargeId;
	}

	public String getFrameId() {
		return frameId;
	}

	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}

	public Integer getDigitalUnitId() {
		return digitalUnitId;
	}

	public void setDigitalUnitId(Integer digitalUnitId) {
		this.digitalUnitId = digitalUnitId;
	}

	@Override
	public String toString() {
		return "Panel [id=" + id + ", panelId=" + panelId + ", digitalUnitId=" + digitalUnitId + ", panelKey="
				+ panelKey + ", districtId=" + districtId + ", districtName=" + districtName + ", inCharge=" + inCharge
				+ ", outOfCharge=" + outOfCharge + ", addressId=" + addressId + ", addressName=" + addressName
				+ ", postCode=" + postCode + ", panelTypeCode=" + panelTypeCode + ", panelType=" + panelType
				+ ", panelPosition=" + panelPosition + ", orient=" + orient + ", shoppingMallId=" + shoppingMallId
				+ ", shoppingMallName=" + shoppingMallName + ", outChargeId=" + outChargeId + ", outChargeReason="
				+ outChargeReason + ", tvAreaId=" + tvAreaId + ", tvAreaName=" + tvAreaName + ", longitude=" + longitude
				+ ", lattitude=" + lattitude + ", frameId=" + frameId + "]";
	}
}
