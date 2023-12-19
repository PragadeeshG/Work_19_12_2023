package com.test1;

public class MetaWorkflow {
	private long id;
	private String workflowDesc;
	private String remarks;
	private String workflowType;
	private String workflowBean;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public MetaWorkflow() {

	}

	public MetaWorkflow(long id, String workflowDesc, String remarks, String workflowType, String workflowBean,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.workflowDesc = workflowDesc;
		this.remarks = remarks;
		this.workflowType = workflowType;
		this.workflowBean = workflowBean;
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

	public String getWorkflowDesc() {
		return workflowDesc;
	}

	public void setWorkflowDesc(String workflowDesc) {
		this.workflowDesc = workflowDesc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getWorkflowType() {
		return workflowType;
	}

	public void setWorkflowType(String workflowType) {
		this.workflowType = workflowType;
	}

	public String getWorkflowBean() {
		return workflowBean;
	}

	public void setWorkflowBean(String workflowBean) {
		this.workflowBean = workflowBean;
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
