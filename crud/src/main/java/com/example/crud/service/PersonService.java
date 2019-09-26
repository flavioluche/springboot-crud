package com.example.crud.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.crud.dao.PersonDao;
import com.example.crud.model.Person;

@Service
//Could also be a Component 
public class PersonService {
	
	private final PersonDao personDao;
	
	//Dependecy Injection
	@Autowired
	public PersonService(@Qualifier("fakeDao")PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public int addPerson(Person person) {
		return personDao.insertPerson(person);
	}
	
	public List<Person> getAllPeople(){
		return personDao.selectAllPeople();
	}

	public Optional<Person> getPersonById(UUID id){
		return personDao.selectPersonById(id);
	}
	
	public int deletePerson(UUID id) {
		return personDao.deletePerson(id);
	}
	
	public int updatePerson(UUID id, Person newPerson) {
		return personDao.updatePersonByID(id, newPerson);
	}
	
	
	
}
