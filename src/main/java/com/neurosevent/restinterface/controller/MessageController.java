package com.neurosevent.restinterface.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neurosevent.restinterface.dto.MessageDTO;
import com.neurosevent.restinterface.dto.RequestForMessages;
import com.neurosevent.restinterface.service.MessageService;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

	private final Logger log = LoggerFactory.getLogger(MessageController.class);

	@Autowired
	private MessageService messageService;

	@GetMapping("/get/{topic}")
	public List<MessageDTO> getFromTopic(@PathVariable String topic, @RequestBody RequestForMessages request) {
		return messageService.retrieveMessagesInTopicForSubscriber(topic, request.getSubscriberUrl());
	}
}
