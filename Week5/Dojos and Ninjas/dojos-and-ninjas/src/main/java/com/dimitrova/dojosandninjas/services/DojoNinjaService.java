package com.dimitrova.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dimitrova.dojosandninjas.models.Dojo;
import com.dimitrova.dojosandninjas.models.Ninja;
import com.dimitrova.dojosandninjas.repositories.DojoRepository;
import com.dimitrova.dojosandninjas.repositories.StudentRepository;

@Service
public class DojoNinjaService {
	
//	set up access to repositories
	@Autowired
	private DojoRepository dojoRepo;
	
	@Autowired
	private StudentRepository ninjaRepo;

//	how to find list of all dojos
	public List<Dojo> allDojos() {
		return this.dojoRepo.findAll();
	}
	
//	locate just one dojo
	public Dojo getOneDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}

//	create new dojo
	public Dojo createDojo(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
	
//	create new ninja
	public Ninja createNinja(Ninja ninja) {
		return this.ninjaRepo.save(ninja);
	}
	
	
}
