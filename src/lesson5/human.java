
package lesson5;

public class human {
    
    String name;
    car3 car;
    BankAccount bA;
    
    void info(){
        System.out.println("Imya: "+name +" cvet mashini: " +car.color + " balance bankovskogo sheta: " +bA.balance);
    }
    
}

class HumanTest {
    public static void main (String[] args) {
        human h = new human();
        h.name = "David";
        h.car = new car3("red", "v8");
        h.bA = new BankAccount(18, 200.5);
        h.info();
        
    }
    
    
}

class car3{
    
    car3(String c, String e) {
        color=c;
        engine=e;
    }
    
    String color;
    String engine;
     
}

class BankAccount {
    BankAccount(int id2, double balance2){
        id=id2;
        balance = balance2;
    }
    int id;
    double balance;
}