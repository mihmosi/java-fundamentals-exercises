package com.devskiller.jfairy.producer.person;

import com.bobocode.model.Sex;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Person {
    private String firstName;
    private String lastName;
    private Sex sex;
    private String email;
    private LocalDate DateOfBirth;

}
