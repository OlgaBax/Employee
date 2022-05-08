package ru.bainc.main.model;

import lombok.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class Employee {
    private int tabNum;
    private String name;
    private String middlename;
    private String surname;
    private int age;
    private String position;
    private int salary;




    public String  toCSVString() {
        return new StringBuilder().
        append(getTabNum()).append(";").append(getName()).append(";").append(getMiddlename()).append(";" )
                        .append(getSurname()).append(";").append(getAge()).append(";").append(getPosition())
                .append(";").append(getSalary()).append("\n").toString();
        }
    }











