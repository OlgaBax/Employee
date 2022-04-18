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


    public static boolean saveEmployeeListToFile(List<Employee> employeeList, String path) {
       try {
            FileWriter writer = new FileWriter(path);
            toCSVString(employeeList,writer);
            writer.flush();
        } catch (IOException e) {
            return false;
        }
        return true;

    }

    public static List<Employee> loadEmployeeListFromFile(String path) throws Exception {
        List<Employee> employeeList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] employeeCsv = line.split(";");
                if (employeeCsv.length > 7) {
                    throw new Exception("Не верное количество полей");
                }
                Employee employeeObj = new Employee(Integer.parseInt(employeeCsv[0]),
                        employeeCsv[1],
                        employeeCsv[2],
                        employeeCsv[3],
                        Integer.parseInt(employeeCsv[4]),
                        employeeCsv[5],
                        Integer.parseInt(employeeCsv[6]));
                employeeList.add(employeeObj);
            }
        }
        return employeeList;

    }

    public static void  toCSVString(List<Employee> employeeList, FileWriter fileWriter) throws IOException {
        for (Employee employee : employeeList) {
            fileWriter.write(employee.getTabNum() + ";" +
                    employee.getName() + ";" +
                    employee.getMiddlename() + ";" +
                    employee.getSurname() + ";" +
                    employee.getAge() + ";" +
                    employee.getPosition() + ";" +
                    employee.getSalary() + ";" +
                    "\n");
        }
    }
}










