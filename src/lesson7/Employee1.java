// homework lesson7

package lesson7;

public class Employee1 {
    
    String id;
    public String surname;
    private double salary;
    
    public void showInfoId() {
        System.out.println("Id: " + id);
    }
    
    public void showInfoSurname() {
        System.out.println("Surname: " + surname);
    } 
   
     public void showInfoSalary() {
        System.out.println("Salary: " + salary);
    }
    
    
     private Employee1 (String id1, String surname1, double salary1) {
         
        id = id1;
        surname = surname1;
        salary = salary1;
     }
    
     Employee1 (String id2, String surname2) {
         this (id2, surname2, 0.0);
     }
     public Employee1 (String id3) {
         this (id3, null, 0.0);
     }   
    
    
    public static void main (String[] args) {
        
        Employee1 em1 = new Employee1("IT", "Melnyk", 500.00);
        em1.showInfoId();
        em1.showInfoSurname();
        em1.showInfoSalary();
        System.out.println("Id: " + em1.id + ", " + "surname: " + em1.surname + ", " + "salary: " + em1.salary +".");
        
    }
     
}

class Employee1Test {
    
    public static void main (String[] args) {
        
        Employee1 em2 = new Employee1("SALE");
        em2.showInfoId();
        em2.showInfoSurname();
        em2.showInfoSalary();
        
        System.out.println();
        
        Employee1 em3 = new Employee1("Marketing", "Kuper");
        em3.showInfoId();
        em3.showInfoSurname();
        em3.showInfoSalary();
        
        Employee1 em4 = new Employee1("It", "Petrov", 5000.0);
        System.out.println("Id: "+ em4.id + ", surname: "+em4.surname + ", salary: "+em4.salary);
       
    }
    
    
}
