package com.example.testHtmlX.repository;
// src/main/java/com/example/contact/repository/ContactRepository.java

import com.example.testHtmlX.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}

