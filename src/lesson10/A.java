
package lesson10;
// import lesson9.car; // importiruem 1 klass paketa lesson9
import lesson9.Student;
//import lesson9.*; // importiruem vsie klassi psketa lesson9
//import lesson8.*;
import java.lang.*;
public class A {
    public static void main(String[] args) {
        //lesson9.car c1 = new lesson9.car("red", "v6");
        // car c2 = new car("black", "v4");
        // lesson9.Student st1 = new lesson9.Student();
        // lesson8.Student st2 = new lesson8.Student("Petr", 3);
        
        java.lang.String st = new java.lang.String("Hello");
        String st01 = new String("Hi");
        Student st3 = new Student();
        System.out.println(st3.z);
        System.out.println(Student.c);
    }
    
    class B {
        
        Student st4 = new Student();
        
    }
    
}
