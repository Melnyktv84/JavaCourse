
package lesson5;

public class hw5 {
    
}

class Employee {
    
    int id;
    String surname;
    int age;
    double salary;
    int department;
    

double uvelichenieZarplatiVdvoe (Employee a) {
System.out.println("Rabotnik " + surname +", " + age +". "+"Zarplata do uvelicheniya: "+ salary);
double ZarplataUvelichennayaVdvoe = a.salary*2;
System.out.println("Rabotnik " + surname +", " + age+". "+ "Zarplata uvelichennaya vdvoe: " + ZarplataUvelichennayaVdvoe);
System.out.println();
return ZarplataUvelichennayaVdvoe;

}

}

class EmployeeTest {
    
    public static void main (String[] args) {
        
    
    Employee Rabotnik1 = new Employee();
    Rabotnik1.id = 1;
    Rabotnik1.surname = "Melnyk";
    Rabotnik1.age = 36;
    Rabotnik1.salary = 2000.55;
    Rabotnik1.department=5;
    Rabotnik1.uvelichenieZarplatiVdvoe(Rabotnik1);
    
    Employee EmployeeTest=new Employee();
    
    
    Employee Rabotnik2 = new Employee();
    Rabotnik2.id = 1;
    Rabotnik2.surname = "Melnyk";
    Rabotnik2.age = 32;
    Rabotnik2.salary = 4500.00;
    Rabotnik2.department=5;
    Rabotnik2.uvelichenieZarplatiVdvoe(Rabotnik2);
    
    
    Employee RabotnikTest = new Employee();
    RabotnikTest.uvelichenieZarplatiVdvoe(Rabotnik1);
    RabotnikTest.uvelichenieZarplatiVdvoe(Rabotnik2);
    
    
    
    
    
            }
    
    
}