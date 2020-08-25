package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Contato;

@Repository
public interface IContatoRepository extends CrudRepository<Contato, Long> {
	
	

}
