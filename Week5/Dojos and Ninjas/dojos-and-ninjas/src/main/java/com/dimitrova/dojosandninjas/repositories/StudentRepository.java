package com.dimitrova.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dimitrova.dojosandninjas.models.Ninja;

@Repository
public interface StudentRepository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
}
