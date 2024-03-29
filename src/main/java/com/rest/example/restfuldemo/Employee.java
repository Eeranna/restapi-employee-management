package com.rest.example.restfuldemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String address;
}
