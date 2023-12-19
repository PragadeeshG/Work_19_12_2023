package com.test1;

public class MetaWorkflowInstance {
	private long id;
	private long wfId;
	private String status;
	private String refId;
	private String wfType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public MetaWorkflowInstance() {

	}

	public MetaWorkflowInstance(long id, long wfId, String status, String refId, String wfType, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.wfId = wfId;
		this.status = status;
		this.refId = refId;
		this.wfType = wfType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getWfId() {
		return wfId;
	}

	public void setWfId(long wfId) {
		this.wfId = wfId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getWfType() {
		return wfType;
	}

	public void setWfType(String wfType) {
		this.wfType = wfType;
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
