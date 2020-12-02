
package lesson7;


public class Employee {
    
    protected double salary;
    
    protected void dvoivayaZP() {
        double result = salary*2;
        System.out.println("Novaya z/p: " + result);
    }
     protected Employee (double salary2) {
        salary=salary2;
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee(2000.00);
        System.out.println(emp.salary);
        emp.dvoivayaZP();
         System.out.println(emp.salary);
        
    }
}

 class EmployeeTest {
    public static void main(String[] args) {
        Employee em1 = new Employee(100.09);
        System.out.println(em1.salary);
        em1.dvoivayaZP();
    }
    
    
}
