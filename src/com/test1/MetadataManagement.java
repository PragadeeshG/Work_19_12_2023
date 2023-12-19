package com.test1;

public class MetadataManagement {
	private long metadataCode;
	private String screenName;
	private long screenId;
	private long refId;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public MetadataManagement() {

	}

	public MetadataManagement(long metadataCode, String screenName, long screenId, long refId, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.metadataCode = metadataCode;
		this.screenName = screenName;
		this.screenId = screenId;
		this.refId = refId;
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

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public long getRefId() {
		return refId;
	}

	public void setRefId(long refId) {
		this.refId = refId;
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
