package com.neurosevent.restinterface.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neurosevent.restinterface.domain.Subscriber;

@Repository
public interface SubscriberRepo extends MongoRepository<Subscriber, String> {

	List<Subscriber> findByTopic(String topic);

}
