
package lesson5;

public class car2 {
    
    String color;
    String engine;
    int speed;
    
    int gaz(int skorost) {
        speed+=skorost;
        return speed;
    }
     int tormoz(int skorost) {
        speed-=skorost;
        return speed;
    }
     
     
     void showInfo(){
             System.out.println("Cvet: " + color+ ", motor: " +engine + ", skorost: "+speed);
}
}

class car2test{
    public static void main(String[] args) {
      car2 c1 = new car2();
      c1.color = "white";
      c1.engine = "v6";
      c1.speed = 60;
      
      c1.showInfo();
      c1.gaz(10);
      c1.showInfo();
      c1.tormoz(80);
      c1.showInfo();
      
     
    }
}

