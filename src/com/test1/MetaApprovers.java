package com.test1;

public class MetaApprovers {
	private long metadataCode;
	private long screenId;
	private long approverId;
	private String psId;
	private String approverOrder;
	private String approverType;
	private String allowedAction;
	private String remarks;
	private String description;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public MetaApprovers() {

	}

	public MetaApprovers(long metadataCode, long screenId, long approverId, String psId, String approverOrder,
			String approverType, String allowedAction, String remarks, String description, boolean isActive,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.metadataCode = metadataCode;
		this.screenId = screenId;
		this.approverId = approverId;
		this.psId = psId;
		this.approverOrder = approverOrder;
		this.approverType = approverType;
		this.allowedAction = allowedAction;
		this.remarks = remarks;
		this.description = description;
		this.isActive = isActive;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getMetadataCode() {
		return metadataCode;
	}

	public void setMetadataCode(long metadataCode) {
		this.metadataCode = metadataCode;
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public long getApproverId() {
		return approverId;
	}

	public void setApproverId(long approverId) {
		this.approverId = approverId;
	}

	public String getPsId() {
		return psId;
	}

	public void setPsId(String psId) {
		this.psId = psId;
	}

	public String getApproverOrder() {
		return approverOrder;
	}

	public void setApproverOrder(String approverOrder) {
		this.approverOrder = approverOrder;
	}

	public String getApproverType() {
		return approverType;
	}

	public void setApproverType(String approverType) {
		this.approverType = approverType;
	}

	public String getAllowedAction() {
		return allowedAction;
	}

	public void setAllowedAction(String allowedAction) {
		this.allowedAction = allowedAction;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
