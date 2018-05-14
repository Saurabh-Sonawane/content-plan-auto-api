package com.ccuk.model;

import com.ccuk.constants.ApplicationConstant;
import com.ccuk.model.enums.ContentPlanStage;
import com.ccuk.model.enums.ContentPlanStatus;
import com.ccuk.model.enums.Gap;
import com.ccuk.model.enums.Warning;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Document(collection="contentplan")
public class ContentPlan implements Cloneable {

    private String id;
    private String contractNumber;
    private String customer;
    private String advertiserId;
    private String advertiserName;
    private String brandId;
    private String brand;
    private String productId;
    private String productName;
    private String customerId;
    private String customerName;
    private String agency;
    private String salesPersonId;
    private String salesPersonName;
    private String currency;
    private String buyer;
    private BigDecimal price;
    private Long contractId;
    private int designs;
    private Long orderLineNo;
    private int orderStatusCode;
    private int productType;
    private int authorisedCode;
    private int upsites;
    private int requiredPlays;
    private String creativeContact;
    private String ccProduct;
    private ContentPlanStatus status;
    private List<Float> creativeLength;
    private Boolean options;
    private String approvalStatus;
    private String principalId;
    private String principalName;
    private String originatorFlag;
    private int version;
    private ContentPlanStage stage;
    private boolean valid;
    private String reasonCode;
    private String reasonDesc;
    private String command;
    private Gap oasisGap;
    private int oasisGapVersion;
    private int gapStatusCode;
    private Warning warning;
    private boolean warningMsg;
  
    private List<Schedule> scheduleList;


    @JsonFormat(pattern= ApplicationConstant.DATE_FORMAT)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date startDate;

    @JsonFormat(pattern=ApplicationConstant.DATE_FORMAT)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date endDate;

    @JsonFormat(pattern=ApplicationConstant.DATE_FORMAT)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date orderTakenDate;

    @JsonFormat(pattern=ApplicationConstant.DATE_FORMAT)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date confirmedDate;

    @JsonFormat(pattern=ApplicationConstant.DATE_FORMAT)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date authorisedDate;

    @JsonFormat(pattern= ApplicationConstant.ISO_TIME_FORMAT)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime gapStartDateTime;

    private String contentPlanHistoryId;
    @JsonFormat(pattern="dd/MM/yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date newStartDate;

    @JsonFormat(pattern="dd/MM/yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date newEndDate;

    @JsonFormat(pattern="dd/MM/yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDateTime lastModifiedDateTime;

    private boolean startDateModified;
    private boolean endDateModified;

    @JsonFormat(pattern="dd/MM/yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date liveCPStartDate;

    @JsonFormat(pattern="dd/MM/yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date liveCPEndDate;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
    }

    public String getAdvertiserName() {
        return advertiserName;
    }

    public void setAdvertiserName(String advertiserName) {
        this.advertiserName = advertiserName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(String salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public int getDesigns() {
        return designs;
    }

    public void setDesigns(int designs) {
        this.designs = designs;
    }

    public Long getOrderLineNo() {
        return orderLineNo;
    }

    public void setOrderLineNo(Long orderLineNo) {
        this.orderLineNo = orderLineNo;
    }

    public Date getOrderTakenDate() {
        return orderTakenDate;
    }

    public void setOrderTakenDate(Date orderTakenDate) {
        this.orderTakenDate = orderTakenDate;
    }

    public int getOrderStatusCode() {
        return orderStatusCode;
    }

    public void setOrderStatusCode(int orderStatusCode) {
        this.orderStatusCode = orderStatusCode;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public int getAuthorisedCode() {
        return authorisedCode;
    }

    public void setAuthorisedCode(int authorisedCode) {
        this.authorisedCode = authorisedCode;
    }

    public Date getAuthorisedDate() {
        return authorisedDate;
    }

    public void setAuthorisedDate(Date authorisedDate) {
        this.authorisedDate = authorisedDate;
    }

    public int getUpsites() {
        return upsites;
    }

    public void setUpsites(int upsites) {
        this.upsites = upsites;
    }

    public int getRequiredPlays() {
        return requiredPlays;
    }

    public void setRequiredPlays(int requiredPlays) {
        this.requiredPlays = requiredPlays;
    }

    public Date getConfirmedDate() {
        return confirmedDate;
    }

    public void setConfirmedDate(Date confirmedDate) {
        this.confirmedDate = confirmedDate;
    }

    public String getCreativeContact() {
        return creativeContact;
    }

    public void setCreativeContact(String creativeContact) {
        this.creativeContact = creativeContact;
    }

    public String getCcProduct() {
        return ccProduct;
    }

    public void setCcProduct(String ccProduct) {
        this.ccProduct = ccProduct;
    }

    public ContentPlanStatus getStatus() {
        return status;
    }

    public void setStatus(ContentPlanStatus status) {
        this.status = status;
    }

    public List<Float> getCreativeLength() {
        return creativeLength;
    }

    public void setCreativeLength(List<Float> creativeLength) {
        this.creativeLength = creativeLength;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getOptions() {
        return options;
    }

    public void setOptions(Boolean options) {
        this.options = options;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getOriginatorFlag() {
        return originatorFlag;
    }

    public void setOriginatorFlag(String originatorFlag) {
        this.originatorFlag = originatorFlag;
    }
    
    public List<Schedule> getScheduleList() {
		return scheduleList;
	}

	public void setScheduleList(List<Schedule> scheduleList) {
		this.scheduleList = scheduleList;
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public ContentPlanStage getStage() {
		return stage;
	}

	public void setStage(ContentPlanStage stage) {
		this.stage = stage;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getReasonDesc() {
		return reasonDesc;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Gap getOasisGap() {
        return oasisGap;
    }

    public void setOasisGap(Gap oasisGap) {
        this.oasisGap = oasisGap;
    }

    public int getGapStatusCode() {
        return gapStatusCode;
    }

    public void setGapStatusCode(int gapStatusCode) {
        this.gapStatusCode = gapStatusCode;
    }

    public Warning getWarning() {
        return warning;
    }

    public void setWarning(Warning warning) {
        this.warning = warning;
    }

    public int getOasisGapVersion() {
        return oasisGapVersion;
    }

    public void setOasisGapVersion(int oasisGapVersion) {
        this.oasisGapVersion = oasisGapVersion;
    }

    public LocalDateTime getGapStartDateTime() {
		return gapStartDateTime;
	}

	public void setGapStartDateTime(LocalDateTime gapStartDateTime) {
		this.gapStartDateTime = gapStartDateTime;
	}
	
	public boolean isWarningMsg() {
		return warningMsg;
	}

	public void setWarningMsg(boolean warningMsg) {
		this.warningMsg = warningMsg;
	}

    public String getContentPlanHistoryId() {
        return contentPlanHistoryId;
    }

    public void setContentPlanHistoryId(String contentPlanHistoryId) {
        this.contentPlanHistoryId = contentPlanHistoryId;
    }

    public Date getNewStartDate() {
        return newStartDate;
    }

    public void setNewStartDate(Date newStartDate) {
        this.newStartDate = newStartDate;
    }

    public Date getNewEndDate() {
        return newEndDate;
    }

    public void setNewEndDate(Date newEndDate) {
        this.newEndDate = newEndDate;
    }

    public LocalDateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    public boolean isStartDateModified() {
        return startDateModified;
    }

    public void setStartDateModified(boolean startDateModified) {
        this.startDateModified = startDateModified;
    }

    public boolean isEndDateModified() {
        return endDateModified;
    }

    public void setEndDateModified(boolean endDateModified) {
        this.endDateModified = endDateModified;
    }

    public Date getLiveCPStartDate() {
        return liveCPStartDate;
    }

    public void setLiveCPStartDate(Date liveCPStartDate) {
        this.liveCPStartDate = liveCPStartDate;
    }

    public Date getLiveCPEndDate() {
        return liveCPEndDate;
    }

    public void setLiveCPEndDate(Date liveCPEndDate) {
        this.liveCPEndDate = liveCPEndDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContentPlan that = (ContentPlan) o;

        if (designs != that.designs) return false;
        if (orderStatusCode != that.orderStatusCode) return false;
        if (productType != that.productType) return false;
        if (authorisedCode != that.authorisedCode) return false;
        if (upsites != that.upsites) return false;
        if (requiredPlays != that.requiredPlays) return false;
        if (version != that.version) return false;
        if (valid != that.valid) return false;
        if (oasisGapVersion != that.oasisGapVersion) return false;
        if (gapStatusCode != that.gapStatusCode) return false;
        if (warningMsg != that.warningMsg) return false;
        if (startDateModified != that.startDateModified) return false;
        if (endDateModified != that.endDateModified) return false;
        if (contractNumber != null ? !contractNumber.equals(that.contractNumber) : that.contractNumber != null)
            return false;
        if (customer != null ? !customer.equals(that.customer) : that.customer != null) return false;
        if (advertiserId != null ? !advertiserId.equals(that.advertiserId) : that.advertiserId != null) return false;
        if (advertiserName != null ? !advertiserName.equals(that.advertiserName) : that.advertiserName != null)
            return false;
        if (brandId != null ? !brandId.equals(that.brandId) : that.brandId != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (agency != null ? !agency.equals(that.agency) : that.agency != null) return false;
        if (salesPersonId != null ? !salesPersonId.equals(that.salesPersonId) : that.salesPersonId != null)
            return false;
        if (salesPersonName != null ? !salesPersonName.equals(that.salesPersonName) : that.salesPersonName != null)
            return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (buyer != null ? !buyer.equals(that.buyer) : that.buyer != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (contractId != null ? !contractId.equals(that.contractId) : that.contractId != null) return false;
        if (orderLineNo != null ? !orderLineNo.equals(that.orderLineNo) : that.orderLineNo != null) return false;
        if (creativeContact != null ? !creativeContact.equals(that.creativeContact) : that.creativeContact != null)
            return false;
        if (ccProduct != null ? !ccProduct.equals(that.ccProduct) : that.ccProduct != null) return false;
        if (status != that.status) return false;
        if (creativeLength != null ? !creativeLength.equals(that.creativeLength) : that.creativeLength != null)
            return false;
        if (options != null ? !options.equals(that.options) : that.options != null) return false;
        if (approvalStatus != null ? !approvalStatus.equals(that.approvalStatus) : that.approvalStatus != null)
            return false;
        if (principalId != null ? !principalId.equals(that.principalId) : that.principalId != null) return false;
        if (principalName != null ? !principalName.equals(that.principalName) : that.principalName != null)
            return false;
        if (originatorFlag != null ? !originatorFlag.equals(that.originatorFlag) : that.originatorFlag != null)
            return false;
        if (stage != that.stage) return false;
        if (reasonCode != null ? !reasonCode.equals(that.reasonCode) : that.reasonCode != null) return false;
        if (reasonDesc != null ? !reasonDesc.equals(that.reasonDesc) : that.reasonDesc != null) return false;
        if (command != null ? !command.equals(that.command) : that.command != null) return false;
        if (oasisGap != that.oasisGap) return false;
        if (warning != that.warning) return false;
        if (scheduleList != null ? !scheduleList.equals(that.scheduleList) : that.scheduleList != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (orderTakenDate != null ? !orderTakenDate.equals(that.orderTakenDate) : that.orderTakenDate != null)
            return false;
        if (confirmedDate != null ? !confirmedDate.equals(that.confirmedDate) : that.confirmedDate != null)
            return false;
        if (authorisedDate != null ? !authorisedDate.equals(that.authorisedDate) : that.authorisedDate != null)
            return false;
        if (gapStartDateTime != null ? !gapStartDateTime.equals(that.gapStartDateTime) : that.gapStartDateTime != null)
            return false;
        if (contentPlanHistoryId != null ? !contentPlanHistoryId.equals(that.contentPlanHistoryId) : that.contentPlanHistoryId != null)
            return false;
        if (newStartDate != null ? !newStartDate.equals(that.newStartDate) : that.newStartDate != null) return false;
        if (newEndDate != null ? !newEndDate.equals(that.newEndDate) : that.newEndDate != null) return false;
        if (lastModifiedDateTime != null ? !lastModifiedDateTime.equals(that.lastModifiedDateTime) : that.lastModifiedDateTime != null)
            return false;
        if (liveCPStartDate != null ? !liveCPStartDate.equals(that.liveCPStartDate) : that.liveCPStartDate != null)
            return false;
        return liveCPEndDate != null ? liveCPEndDate.equals(that.liveCPEndDate) : that.liveCPEndDate == null;
    }

    @Override
    public int hashCode() {
        int result = contractNumber != null ? contractNumber.hashCode() : 0;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (advertiserId != null ? advertiserId.hashCode() : 0);
        result = 31 * result + (advertiserName != null ? advertiserName.hashCode() : 0);
        result = 31 * result + (brandId != null ? brandId.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (agency != null ? agency.hashCode() : 0);
        result = 31 * result + (salesPersonId != null ? salesPersonId.hashCode() : 0);
        result = 31 * result + (salesPersonName != null ? salesPersonName.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (contractId != null ? contractId.hashCode() : 0);
        result = 31 * result + designs;
        result = 31 * result + (orderLineNo != null ? orderLineNo.hashCode() : 0);
        result = 31 * result + orderStatusCode;
        result = 31 * result + productType;
        result = 31 * result + authorisedCode;
        result = 31 * result + upsites;
        result = 31 * result + requiredPlays;
        result = 31 * result + (creativeContact != null ? creativeContact.hashCode() : 0);
        result = 31 * result + (ccProduct != null ? ccProduct.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (creativeLength != null ? creativeLength.hashCode() : 0);
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (approvalStatus != null ? approvalStatus.hashCode() : 0);
        result = 31 * result + (principalId != null ? principalId.hashCode() : 0);
        result = 31 * result + (principalName != null ? principalName.hashCode() : 0);
        result = 31 * result + (originatorFlag != null ? originatorFlag.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + (stage != null ? stage.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (reasonCode != null ? reasonCode.hashCode() : 0);
        result = 31 * result + (reasonDesc != null ? reasonDesc.hashCode() : 0);
        result = 31 * result + (command != null ? command.hashCode() : 0);
        result = 31 * result + (oasisGap != null ? oasisGap.hashCode() : 0);
        result = 31 * result + oasisGapVersion;
        result = 31 * result + gapStatusCode;
        result = 31 * result + (warning != null ? warning.hashCode() : 0);
        result = 31 * result + (warningMsg ? 1 : 0);
        result = 31 * result + (scheduleList != null ? scheduleList.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (orderTakenDate != null ? orderTakenDate.hashCode() : 0);
        result = 31 * result + (confirmedDate != null ? confirmedDate.hashCode() : 0);
        result = 31 * result + (authorisedDate != null ? authorisedDate.hashCode() : 0);
        result = 31 * result + (gapStartDateTime != null ? gapStartDateTime.hashCode() : 0);
        result = 31 * result + (contentPlanHistoryId != null ? contentPlanHistoryId.hashCode() : 0);
        result = 31 * result + (newStartDate != null ? newStartDate.hashCode() : 0);
        result = 31 * result + (newEndDate != null ? newEndDate.hashCode() : 0);
        result = 31 * result + (lastModifiedDateTime != null ? lastModifiedDateTime.hashCode() : 0);
        result = 31 * result + (startDateModified ? 1 : 0);
        result = 31 * result + (endDateModified ? 1 : 0);
        result = 31 * result + (liveCPStartDate != null ? liveCPStartDate.hashCode() : 0);
        result = 31 * result + (liveCPEndDate != null ? liveCPEndDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ContentPlan{" +
                "id='" + id + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", customer='" + customer + '\'' +
                ", advertiserId='" + advertiserId + '\'' +
                ", advertiserName='" + advertiserName + '\'' +
                ", brandId='" + brandId + '\'' +
                ", brand='" + brand + '\'' +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", agency='" + agency + '\'' +
                ", salesPersonId='" + salesPersonId + '\'' +
                ", salesPersonName='" + salesPersonName + '\'' +
                ", currency='" + currency + '\'' +
                ", buyer='" + buyer + '\'' +
                ", price=" + price +
                ", contractId=" + contractId +
                ", designs=" + designs +
                ", orderLineNo=" + orderLineNo +
                ", orderStatusCode=" + orderStatusCode +
                ", productType=" + productType +
                ", authorisedCode=" + authorisedCode +
                ", upsites=" + upsites +
                ", requiredPlays=" + requiredPlays +
                ", creativeContact='" + creativeContact + '\'' +
                ", ccProduct='" + ccProduct + '\'' +
                ", status=" + status +
                ", creativeLength=" + creativeLength +
                ", options=" + options +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", principalId='" + principalId + '\'' +
                ", principalName='" + principalName + '\'' +
                ", originatorFlag='" + originatorFlag + '\'' +
                ", version=" + version +
                ", stage=" + stage +
                ", valid=" + valid +
                ", reasonCode='" + reasonCode + '\'' +
                ", reasonDesc='" + reasonDesc + '\'' +
                ", command='" + command + '\'' +
                ", oasisGap=" + oasisGap +
                ", oasisGapVersion=" + oasisGapVersion +
                ", gapStatusCode=" + gapStatusCode +
                ", warning=" + warning +
                ", warningMsg=" + warningMsg +
                ", scheduleList=" + scheduleList +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", orderTakenDate=" + orderTakenDate +
                ", confirmedDate=" + confirmedDate +
                ", authorisedDate=" + authorisedDate +
                ", gapStartDateTime=" + gapStartDateTime +
                ", contentPlanHistoryId='" + contentPlanHistoryId + '\'' +
                ", newStartDate=" + newStartDate +
                ", newEndDate=" + newEndDate +
                ", lastModifiedDateTime=" + lastModifiedDateTime +
                ", startDateModified=" + startDateModified +
                ", endDateModified=" + endDateModified +
                ", liveCPStartDate=" + liveCPStartDate +
                ", liveCPEndDate=" + liveCPEndDate +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


