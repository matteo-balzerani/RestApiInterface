package com.neurosevent.restinterface.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neurosevent.restinterface.domain.Message;
import com.neurosevent.restinterface.dto.MessageDTO;
import com.neurosevent.restinterface.repository.MessageRepo;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepo messageRepo;
	
	public List<MessageDTO> retrieveMessagesInTopicForSubscriber(String topic,String subscriberUrl){
		List<Message> messages=messageRepo.findByTopicAndSubscriberUrl(topic,subscriberUrl);
		return messages.stream().map(m-> mapper(m)).collect(Collectors.toList());
	}

	private MessageDTO mapper(Message m) {
		return new MessageDTO(m.getTopic(), m.getPayload(), Date.from(m.getCreatedDate()).toString());
	}
	
}
