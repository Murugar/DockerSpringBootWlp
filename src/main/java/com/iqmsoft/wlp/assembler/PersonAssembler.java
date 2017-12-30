package com.iqmsoft.wlp.assembler;

import org.springframework.stereotype.Component;

import com.iqmsoft.wlp.domain.Person;
import com.iqmsoft.wlp.dto.PersonDTO;


@Component
public class PersonAssembler {
    public Person toPerson(String firstName, String lastName) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return person;
    }

    public PersonDTO toPersonDTO(Person person) {
        PersonDTO personDTO = new PersonDTO(person.getId(), person.getFirstName(), person.getLastName());
        return personDTO;
    }
}
