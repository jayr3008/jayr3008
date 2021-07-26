package com.projects.contacts.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.mongodb.core.MongoTemplate;



@Configuration
public class MongoConfig {

	public @Bean MongoClient mongoClient() {
	      return MongoClients.create("mongodb+srv://Jay3008:Jay%40charusat2012@cluster0.wsmh5.mongodb.net/test?authSource=admin&replicaSet=atlas-1x8tmv-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true");
	  }

	  public @Bean MongoTemplate mongoTemplate() {
	      return new MongoTemplate(mongoClient(), "Projects");
	  }

}