
package lesson4;

public class car {
    car(String cvet, String motor) {
        color=cvet;
        engine=motor;
        
        System.out.println("Cvet mashini: " + color+ ". Motor mashini: " + engine);
    }
            
        String color;
        String engine;
    
}

class cartest {
 
 public static void main (String[] args) {
     
     
        car car1 = new car("black", "v8");
        car car2 = new car("white", "v6");
  




 }
    
}