package com.neurosevent.restinterface.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neurosevent.restinterface.dto.SubscriberDTO;
import com.neurosevent.restinterface.service.SubscriberService;

@RestController
@RequestMapping("/api/subscriber")
public class SubscriberController {

	private final Logger log = LoggerFactory.getLogger(SubscriberController.class);

	@Autowired
	private SubscriberService subscriberService;

	@GetMapping("/get/{topic}")
	public List<SubscriberDTO> getForTopic(@PathVariable String topic) {
		return subscriberService.retrieveAllSubscriberPerTopic(topic);
	}

	@PostMapping("/{topic}")
	public SubscriberDTO addSubscriberToTopic(@RequestBody SubscriberDTO newSubscriber) {
		return subscriberService.addSubscriberToTopic(newSubscriber);
	}
}
