package com.projects.contacts.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.projects.contacts.model.Contact;
@Repository
public interface ContactRepository extends MongoRepository<Contact,Integer>{

	// Getting only name and excluding id field.
    @Query(value = "{}", fields = "{name : 1,_id : 0}")
    public List<Contact> findNameAndExcludeId();

    // getting only name age fields but id will be fetched automatically because it is annotated with @Id.
    @Query(value = "{}", fields = "{name : 1, age : 1}")
    public List<Contact> nameAndAge();

    // Fetches only Id.
    @Query(value = "{}", fields = "{id : 1}")
    public List<Contact> findOnlyIds();

    // Fetches only id and age.
    @Query(value = "{}", fields = "{id : 1, age : 1}")
    public List<Contact> findByIdAge();

    // Fetches only id and age.
    @Query(value = "{}", fields = "{id : 0}")
    public List<Contact> excludeId();
}
