package com.iqmsoft.repository;

import org.springframework.data.repository.CrudRepository;

import com.iqmsoft.model.Contact;


public interface ContactRepository extends CrudRepository<Contact, String> {
    @Override
    void delete(Contact deleted);
}