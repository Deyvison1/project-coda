package com.project.coda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.coda.models.Contato;

@Repository
public interface IContatoRepository extends JpaRepository<Contato, Long> {
	Contato findContatoById(Long id);
	Contato findContatoByEmailsId(Long id);
	Contato findByEmailsEmail(String email);
}