package com.neurosevent.restinterface.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.neurosevent.restinterface.repository")
public class MongoDBConfiguration {

}
