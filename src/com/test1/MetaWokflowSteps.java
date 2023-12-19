package com.test1;

public class MetaWokflowSteps {
	private long stepId;
	private long wfId;
	private String stepStatus;
	private String action;
	private String remarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public MetaWokflowSteps() {

	}

	public MetaWokflowSteps(long stepId, long wfId, String stepStatus, String action, String remarks,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.stepId = stepId;
		this.wfId = wfId;
		this.stepStatus = stepStatus;
		this.action = action;
		this.remarks = remarks;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getStepId() {
		return stepId;
	}

	public void setStepId(long stepId) {
		this.stepId = stepId;
	}

	public long getWfId() {
		return wfId;
	}

	public void setWfId(long wfId) {
		this.wfId = wfId;
	}

	public String getStepStatus() {
		return stepStatus;
	}

	public void setStepStatus(String stepStatus) {
		this.stepStatus = stepStatus;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
