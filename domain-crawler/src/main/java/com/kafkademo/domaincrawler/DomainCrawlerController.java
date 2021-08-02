package com.kafkademo.domaincrawler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domain")
public class DomainCrawlerController {
	
	DomainCrawlerService domaincrawlerService;
	@GetMapping("/lookup/{name}")
	public String lookup(@PathVariable("name") final String name){
	{
		
	domaincrawlerService.crawl(name);
	return "Domial list scraped";
	}

}
}