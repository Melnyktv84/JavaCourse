
package lesson5;

public class hw5rightsolution {
    
}

class Employee {
    
    int id;
    String surname;
    int age;
    double salary;
    String department;
    

        
    
Employee (int id2, String surname2, int age2, double salary2, String department2){
id = id2;
surname = surname2;
age = age2;
salary = salary2;
department = department2;
   
}

double uvelichenieZPvDvoe () {
    salary=salary*2;
    return salary;
    
}

}
class EmployeeTest {
   
    public static void main(String[] args) {
        
   
    
Employee em1 = new Employee (1, "Ivanov", 32, 4000.00, "IT");
Employee em2 = new Employee(2, "Petrov", 31, 7000.50, "Sales");

em1.uvelichenieZPvDvoe();
System.out.println("Novaya zarplata " + em1.surname + ":" +em1.salary);

double newSalary = em2.uvelichenieZPvDvoe();

System.out.println("Novaya zarplata " + em2.surname + ":" +newSalary);



    }

    
  
}