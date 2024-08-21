package com.springboot.starter.bean;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Slf4j
public class Person {

    @Id
    private String personId;

    @NotBlank(message = "Name should not be blank.")
    private String name;

    @NotEmpty(message = "Address should not be empty")
    private String address;

    @NotEmpty(message = "Hobby should not be empty")
    private List<String> hobbies;


    public String toString() {
        String var10000 = this.getName();
        String str = "Person(name=" + var10000 + ", id=" + this.getPersonId() + ", hobbies=" + this.getHobbies() + ")";
        log.info(str);
        return str;
    }
}
