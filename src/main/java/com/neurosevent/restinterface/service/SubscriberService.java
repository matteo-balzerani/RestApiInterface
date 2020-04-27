package com.neurosevent.restinterface.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neurosevent.restinterface.domain.Subscriber;
import com.neurosevent.restinterface.dto.SubscriberDTO;
import com.neurosevent.restinterface.repository.SubscriberRepo;

@Service
public class SubscriberService {

	@Autowired
	private SubscriberRepo subscriberRepo;

	public SubscriberDTO addSubscriberToTopic(SubscriberDTO subscriberDTO) {
		Subscriber response = subscriberRepo.save(subscriberDTOToSubscriber(subscriberDTO));
		return subscriberToSubscriberDTO(response);
	}

	public List<SubscriberDTO> retrieveAllSubscriberPerTopic(String topic) {
		List<Subscriber> response = subscriberRepo.findByTopic(topic);
		return response.stream().map(sub -> subscriberToSubscriberDTO(sub)).collect(Collectors.toList());
	}

	private Subscriber subscriberDTOToSubscriber(SubscriberDTO input) {
		Subscriber s = new Subscriber();
		s.setSubscriber(input.getSubscriber());
		s.setTopic(input.getTopic());
		s.setUrl(input.getUrl());
		return s;
	}

	private SubscriberDTO subscriberToSubscriberDTO(Subscriber input) {
		SubscriberDTO s = new SubscriberDTO();
		s.setSubscriber(input.getSubscriber());
		s.setTopic(input.getTopic());
		s.setUrl(input.getUrl());
		return s;
	}
}
