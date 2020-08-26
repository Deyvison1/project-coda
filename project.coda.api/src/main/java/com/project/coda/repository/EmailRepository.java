package com.project.coda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.coda.models.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {
	
}
