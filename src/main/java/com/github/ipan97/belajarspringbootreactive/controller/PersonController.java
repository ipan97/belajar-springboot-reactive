package com.github.ipan97.belajarspringbootreactive.controller;

import com.github.ipan97.belajarspringbootreactive.model.Person;
import com.github.ipan97.belajarspringbootreactive.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Created by Ipan Taupik Rahman.
 * Date: 26/12/17
 * Time: 18:29
 * Project belajar-springboot-reactive
 * Package com.github.ipan97.belajarspringbootreactive.controller
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public Flux<Person> index() {
        return personRepository.findAll();
    }

}
