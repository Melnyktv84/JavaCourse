// homework lesson 7

package lesson7;

public class hwDrugoyKlass {
    
    public static void main(String[] args) {
      Employee1 Emp1 = new Employee1("Sale");
      Emp1.showInfoId();
      Emp1.showInfoSalary();
      
      Employee1 Emp2 = new Employee1("Markating", "Savin");
      System.out.println("surname: " + Emp1.surname);
      
      System.out.println();
      
      Employee1 Emp3 = new Employee1("IT", "Petrov", 7000.50);
      
      Emp3.showInfoSurname();
      Emp3.showInfoSalary();
      
     
        
    }
    
}
