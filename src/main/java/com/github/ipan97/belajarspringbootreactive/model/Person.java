package com.github.ipan97.belajarspringbootreactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Ipan Taupik Rahman.
 * Date: 26/12/17
 * Time: 18:25
 * Project belajar-springboot-reactive
 * Package com.github.ipan97.belajarspringbootreactive.model
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    @Id
    private String id;

    private String name;

    private Integer age;
}
