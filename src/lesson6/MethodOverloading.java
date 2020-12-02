
package lesson6;


public class MethodOverloading {
    
    void show (int i1) {
        System.out.println(i1);
        System.out.println("Data type is int");
    }
    
    void show (int ab, int bd) {
        System.out.println(ab);
        System.out.println("Data type is int");
    }
    
     void show (String s, int a) {
        System.out.println("String: " + s + "," + "int: " + a);
    }
     
      void show (int a, String s) {
        System.out.println("Kakoi horoshiy den!");
    }
      
    void show (boolean b1) {
     
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }
    
        void show(String s1) {
     
        System.out.println(s1);
        System.out.println("Data type is String");
    }
}

class MethodOverloadingTest {
    
    public static void main(String[] args) {
        
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        
        boolean b = true;
        mO.show(b);
        
        String s2 = "Privet!";
        mO.show(s2);
        
        mO.show("Privet!!!", 10);
        mO.show(10, "Privet!!!");
                
    }
    
}
