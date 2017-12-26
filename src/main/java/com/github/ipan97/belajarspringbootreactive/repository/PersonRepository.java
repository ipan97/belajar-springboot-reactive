package com.github.ipan97.belajarspringbootreactive.repository;

import com.github.ipan97.belajarspringbootreactive.model.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

/**
 * Created by Ipan Taupik Rahman.
 * Date: 26/12/17
 * Time: 18:27
 * Project belajar-springboot-reactive
 * Package com.github.ipan97.belajarspringbootreactive.repository
 */
public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

    Flux<Person> findByName(String name);
}
