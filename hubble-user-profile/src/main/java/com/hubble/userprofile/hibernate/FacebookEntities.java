package com.hubble.userprofile.hibernate;

// Generated Feb 23, 2013 11:18:08 AM by Hibernate Tools 3.4.0.CR1

/**
 * FacebookEntities generated by hbm2java
 */
public class FacebookEntities implements java.io.Serializable {

	private String id;
	private String name;
	private String category;
	private String createdTime;
	private String keywords;
	private String description;

	public FacebookEntities() {
	}

	public FacebookEntities(String id) {
		this.id = id;
	}

	public FacebookEntities(String id, String name, String category,
			String createdTime, String keywords, String description) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.createdTime = createdTime;
		this.keywords = keywords;
		this.description = description;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}