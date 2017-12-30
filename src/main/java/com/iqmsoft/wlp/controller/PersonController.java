package com.iqmsoft.wlp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.wlp.assembler.PersonAssembler;
import com.iqmsoft.wlp.domain.Person;
import com.iqmsoft.wlp.dto.PersonDTO;
import com.iqmsoft.wlp.repository.PersonRepository;


@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonAssembler personAssembler;

    @RequestMapping("/person")
    public PersonDTO post(@RequestParam(value = "firstName", defaultValue = "defaultFirstName") String firstName, @RequestParam(value = "lastName", defaultValue = "defaultLastName") String lastName) {

        Person person = personAssembler.toPerson(firstName, lastName);
        personRepository.save(person);
        PersonDTO personDTO = personAssembler.toPersonDTO(person);

        return personDTO;
    }
}
