package ru.bainc.main.service;
import ru.bainc.main.model.Employee;
import java.util.ArrayList;
import java.util.List;


public class EmployeeService {
    public static List<Employee> getList (){
        List<Employee> result = new ArrayList<>();
        result.add(new Employee(1, "Igor", "Ivanovich", "Chichkin", 21, "manager", 900));
        result.add(new Employee(2, "Elena", "Olegovna", "Bukina", 38, "economist", 150));
        result.add(new Employee(3, "Sergey", "Anatolevich", "Puchkin", 61, "dvornic", 50));
        result.add(new Employee(4, "Irina", "Vladimirovna", "Aksenova", 48, "sekretar", 160));
        result.add(new Employee(5, "Petr", "Sergeevich", "Ovechkin", 36, "gruschik", 100));
        result.add(new Employee(6, "Oleg", "Yrevich", "Sidorov", 29, "security", 120));
        result.add(new Employee(7, "Ylia", "Igorevna", "Sorokina", 55, "buxalter", 200));
        result.add(new Employee(8, "Mariya", "Vasilevna", "Truxina", 49, "spesialist", 180));
        result.add(new Employee(9, "Andrey", "Evgenevich", "Morgunov", 51, "director", 500));
        result.add(new Employee(10, "Olga", "Anatolevna", "Babushkina", 41, "manager", 180));
        result.add(new Employee(11, "Irina", "Sergeevna", "Klenkina", 49, "povar", 180));
        result.add(new Employee(12, "Anastasiya", "Leonidovna", "Ivleva", 48, "spesialist", 100));
        result.add(new Employee(13, "Olga", "Vladimirovna", "Rotanova", 33, "kladovshik", 110));
        result.add(new Employee(14, "Konstantin", "Petrovich", "Pluchkin", 37, "upravlyaushii", 250));
        result.add(new Employee(15, "Natalya", "Olegovna", "Sidorova", 45, "IT", 250));
        result.add(new Employee(16, "Alexandr", "Andreevich", "Semerikov", 42, "shefpovar", 300));
        result.add(new Employee(17, "Ivan", "Ivanovich", "Ivanov", 55, "technik", 150));
        result.add(new Employee(18, "Denis", "Timurovich", "Soin", 35, "IT", 400));
        result.add(new Employee(19, "Alexsey", "Victorovich", "Melnikov", 52, "spesialist", 300));
        result.add(new Employee(20, "Victoria", "Anatolevna", "Polykova", 50, "glavbuch", 350));
        return result;

    }
}
