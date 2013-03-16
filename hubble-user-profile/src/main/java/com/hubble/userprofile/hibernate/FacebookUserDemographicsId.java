package com.hubble.userprofile.hibernate;

// Generated Feb 23, 2013 11:18:08 AM by Hibernate Tools 3.4.0.CR1

/**
 * FacebookUserDemographicsId generated by hbm2java
 */
public class FacebookUserDemographicsId implements java.io.Serializable {

	private String facebookId;
	private String userAppId;

	public FacebookUserDemographicsId() {
	}

	public FacebookUserDemographicsId(String facebookId, String userAppId) {
		this.facebookId = facebookId;
		this.userAppId = userAppId;
	}

	public String getFacebookId() {
		return this.facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public String getUserAppId() {
		return this.userAppId;
	}

	public void setUserAppId(String userAppId) {
		this.userAppId = userAppId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FacebookUserDemographicsId))
			return false;
		FacebookUserDemographicsId castOther = (FacebookUserDemographicsId) other;

		return ((this.getFacebookId() == castOther.getFacebookId()) || (this
				.getFacebookId() != null && castOther.getFacebookId() != null && this
				.getFacebookId().equals(castOther.getFacebookId())))
				&& ((this.getUserAppId() == castOther.getUserAppId()) || (this
						.getUserAppId() != null
						&& castOther.getUserAppId() != null && this
						.getUserAppId().equals(castOther.getUserAppId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFacebookId() == null ? 0 : this.getFacebookId()
						.hashCode());
		result = 37 * result
				+ (getUserAppId() == null ? 0 : this.getUserAppId().hashCode());
		return result;
	}

}