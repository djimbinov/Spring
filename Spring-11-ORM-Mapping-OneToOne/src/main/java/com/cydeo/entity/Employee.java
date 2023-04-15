package com.cydeo.entity;

import javax.persistence.*;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
public class Employee extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    private int salary;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Employee(String firstName, String lastName, String email, LocalDate hireDate, LocalDate hireDate1, int salary, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.hireDate = hireDate1;
        this.salary = salary;
        this.gender = gender;
    }
}