package usingmdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usingmdb.Person;
import usingmdb.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Person create(String firstName, String lastName, int age)
	{
		return personRepository.save(new Person(firstName, lastName, age));
	}
	
	public List<Person> getAll()
	{
		return personRepository.findAll();
	}
	
	public Person getByFirstName(String firstName)
	{
		return personRepository.findByFirstName(firstName);
	}
	
	public Person update(String firstName, String lastName, int age)
	{
		Person p = personRepository.findByFirstName(firstName);
		p.setLastname(lastName);
		p.setAge(age);
		return personRepository.save(p);
	}
	
	public void deleteAll()
	{
		personRepository.deleteAll();
	}
	
	public void deleteByFirstName(String firstName)
	{
		Person p = personRepository.findByFirstName(firstName);
		personRepository.delete(p);

	}
}
