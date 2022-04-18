public class Employee {

    int id;
    public String surname;
    int age;
    private int salary;
    String department;

    Employee (int id2, String surname2, int age2, int salary2, String department2) { // это конструктор
      id = id2;
      surname = surname2;
      age = age2;
      salary = salary2;
      department = department2;
  }

    Employee (int id2) {
        id = id2;
    }

    public Employee (String surname2) {
        surname = surname2;
    }

    private Employee (int age, int salary2) {
        salary = salary2;
   }
     int yvelichenieZarplaty (){
        salary *= 2;
        return salary;
    }
    public void zarplata (int salary) {
        System.out.println("zarplata" + "  " + salary);
    }
    public void familiya (String surname){
        System.out.println("familiya" + "  "+ surname);
    }
    public void nomer (int id){
        System.out.println("nomer" + "  " + id);
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee empl1 = new Employee(1, "Ivanov", 25, 25000, "sales");
        Employee empl2 = new Employee(2, "Petrov", 35, 31000, "IT");
        //Employee empl3 =new Employee (179, "Sidorov",25);

        empl1.zarplata(25000);
        empl1.familiya("Ivanov");
        empl1.nomer( 123);
        empl1.yvelichenieZarplaty();
        //System.out.println("Novaya zarplata   " + empl1.surname + "  " + empl1.salary);
        empl2.zarplata(31000);
        empl2.familiya("Pertov");
        empl2.nomer(148);
        empl2.yvelichenieZarplaty();
        //System.out.println("Novaya zarplata   " + empl2.surname + "  " + empl2.salary);
    }




    //employee1.id = 1;
   // employee1.surname = "Ivanov";
  //  employee1.age = 25;
  //  employee1.salary = 25000;
  //  employee1.department = "SalesDerartment";
  //  employee1.DoubleSalary(employee1.salary);

 //   employee2.id = 1;
  //  employee2.surname = "Petrov";
  //  employee2.age = 35;
  //  employee2.salary = 31000;
  //  employee2.department = "SalesDerartment";
  //  employee2.DoubleSalary(employee2.salary);

}

