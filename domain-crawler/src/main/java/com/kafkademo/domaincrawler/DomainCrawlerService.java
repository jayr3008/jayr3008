package com.kafkademo.domaincrawler;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DomainCrawlerService {
	
	private String KAFKA_TOPIC = "web-domian";
	private KafkaTemplate<String,Domain> kafkaTemplet;

	
	public DomainCrawlerService(KafkaTemplate<String, Domain> kafkaTemplet) {
		
		this.kafkaTemplet = kafkaTemplet;
	}
	public void crawl(String name) {
	
	//Mono<DomainList> domainlistMono = WebClient.create()
	//.get()
	//.uri("https://api.domainsdb.info/v1/domains/search?domain="+name+"&zone=com")
	//.accept(MediaType.APPLICATION_JSON)
	//.retrieve()
	//.bodyToMono(DomainList.class);
	/*
	domainlistMono.subscribe(domainList -> {
		domainList.domains
		.forEach(domain->{
			
			System.out.println("Domain Message : "+ domain.getDomain());
			kafkaTemplet.send(KAFKA_TOPIC,domain);
		});
	});*/
		
	
	}

}
