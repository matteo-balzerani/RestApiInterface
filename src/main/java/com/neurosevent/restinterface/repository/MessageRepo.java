package com.neurosevent.restinterface.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neurosevent.restinterface.domain.Message;

@Repository
public interface MessageRepo extends MongoRepository<Message, String> {

	List<Message> findByTopicAndSubscriberUrl(String topic, String subscriber);

}
