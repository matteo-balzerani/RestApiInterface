package com.neurosevent.restinterface.dto;

import java.io.Serializable;
import java.util.Date;

public class RequestForMessages implements Serializable {

	private static final long serialVersionUID = 1L;

	private String subscriberUrl;
	private Date startingAt;

	public String getSubscriberUrl() {
		return subscriberUrl;
	}

	public void setSubscriberUrl(String subscriberUrl) {
		this.subscriberUrl = subscriberUrl;
	}

	public Date getStartingAt() {
		return startingAt;
	}

	public void setStartingAt(Date startingAt) {
		this.startingAt = startingAt;
	}

	public RequestForMessages(String subscriberUrl, Date startingAt) {
		this.subscriberUrl = subscriberUrl;
		this.startingAt = startingAt;
	}

	public RequestForMessages() {
	}

}
