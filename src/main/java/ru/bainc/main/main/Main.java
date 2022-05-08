package ru.bainc.main.main;


import ru.bainc.main.service.EmployeeService;

public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeService.saveEmployeeListToFile(EmployeeService.getList(), "employees.csv");
        System.out.println(EmployeeService.loadEmployeeListFromFile("employees.csv"));
    }

}
