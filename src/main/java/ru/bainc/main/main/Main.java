package ru.bainc.main.main;
import static ru.bainc.main.model.Employee.loadEmployeeListFromFile;
import static ru.bainc.main.model.Employee.saveEmployeeListToFile;
import static ru.bainc.main.service.EmployeeService.getList;

public class Main {
    public static void main(String[] args) throws Exception {
        saveEmployeeListToFile(getList(), "employees.csv");
        System.out.println(loadEmployeeListFromFile("employees.csv"));
    }

}
