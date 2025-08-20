package com.example.components;

import org.springframework.batch.item.ItemProcessor;

import com.example.record.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person>{

	@Override
	public Person process(Person item) throws Exception {

		final String fname = item.firstName().toUpperCase();
		final String lname = item.lastName().toUpperCase();
		
		final Person transformedPerson = new Person(fname,lname);
		

		return transformedPerson;
		
	}
	
	

}
