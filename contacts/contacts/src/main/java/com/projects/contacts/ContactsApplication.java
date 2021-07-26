package com.projects.contacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.projects.contacts.controller.ContactController;


@SpringBootApplication
@ComponentScan(basePackageClasses = ContactController.class)
public class ContactsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactsApplication.class, args);
	}

}
