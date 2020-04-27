package com.neurosevent.restinterface.dto;

import java.io.Serializable;

public class MessageDTO implements Serializable {

	private static final long serialVersionUID = -7183137239239814734L;

	private String topic;
	private String payload;
	private String creationDate;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public MessageDTO(String topic, String payload, String creationDate) {
		this.topic = topic;
		this.payload = payload;
		this.creationDate = creationDate;
	}

	public MessageDTO() {
	}

}
