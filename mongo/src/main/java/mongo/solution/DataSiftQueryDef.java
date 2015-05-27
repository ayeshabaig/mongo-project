package mongo.solution;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity(value="dataSiftQuery")
public class DataSiftQueryDef {
	@Id
	private ObjectId objectId;
	public ObjectId getObjectId() {
		return objectId;
	}
	public void setObjectId(ObjectId objectId) {
		this.objectId = objectId;
	}
	private String queryDef;
	private String queryName;
	private String requestGUID;
	private String csdValidated;
	private String validateCreatedAt;
	private String validateDPU;
	private String validateError;
	private String validateRateLimit;
	private String validateRateLimitCost;
	private String validateRateLimitReaminin;
	private int stormPathID ;
	private int tokenCost;
	public String getQueryDef() {
		return queryDef;
	}
	public void setQueryDef(String queryDef) {
		this.queryDef = queryDef;
	}
	public String getQueryName() {
		return queryName;
	}
	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}
	public String getRequestGUID() {
		return requestGUID;
	}
	public void setRequestGUID(String requestGUID) {
		this.requestGUID = requestGUID;
	}
	public String getCsdValidated() {
		return csdValidated;
	}
	public void setCsdValidated(String csdValidated) {
		this.csdValidated = csdValidated;
	}
	public String getValidateCreatedAt() {
		return validateCreatedAt;
	}
	public void setValidateCreatedAt(String validateCreatedAt) {
		this.validateCreatedAt = validateCreatedAt;
	}
	public String getValidateDPU() {
		return validateDPU;
	}
	public void setValidateDPU(String validateDPU) {
		this.validateDPU = validateDPU;
	}
	public String getValidateError() {
		return validateError;
	}
	public void setValidateError(String validateError) {
		this.validateError = validateError;
	}
	public String getValidateRateLimit() {
		return validateRateLimit;
	}
	public void setValidateRateLimit(String validateRateLimit) {
		this.validateRateLimit = validateRateLimit;
	}
	public String getValidateRateLimitCost() {
		return validateRateLimitCost;
	}
	public void setValidateRateLimitCost(String validateRateLimitCost) {
		this.validateRateLimitCost = validateRateLimitCost;
	}
	public String getValidateRateLimitReaminin() {
		return validateRateLimitReaminin;
	}
	public void setValidateRateLimitReaminin(String validateRateLimitReaminin) {
		this.validateRateLimitReaminin = validateRateLimitReaminin;
	}
	public int getStormPathID() {
		return stormPathID;
	}
	public void setStormPathID(int stormPathID) {
		this.stormPathID = stormPathID;
	}
	public int getTokenCost() {
		return tokenCost;
	}
	public void setTokenCost(int tokenCost) {
		this.tokenCost = tokenCost;
	}
	@Override
	public String toString() {
		return "DataSiftQueryDef [objectId=" + objectId + ", queryDef="
				+ queryDef + ", queryName=" + queryName + ", requestGUID="
				+ requestGUID + ", csdValidated=" + csdValidated
				+ ", validateCreatedAt=" + validateCreatedAt + ", validateDPU="
				+ validateDPU + ", validateError=" + validateError
				+ ", validateRateLimit=" + validateRateLimit
				+ ", validateRateLimitCost=" + validateRateLimitCost
				+ ", validateRateLimitReaminin=" + validateRateLimitReaminin
				+ ", stormPathID=" + stormPathID + ", tokenCost=" + tokenCost
				+ "]";
	}

}
