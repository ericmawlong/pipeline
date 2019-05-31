package usingmdb;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
	@Id
	String Id;
	String firstName;
	String lastName;
	int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return "Person first name:"+firstName+" Person last name:"+lastName+" Person age:"+age;
	}

	

}
