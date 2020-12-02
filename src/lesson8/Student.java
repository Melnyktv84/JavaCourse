
package lesson8;

public class Student {
    String name;
    int course;
    static int count; // class variable
    int a;
    
    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan.");
    }
    
    public static void showCount(){
        System.out.println("Всего создано студентов: " + count);
        
    }
    
    public void showInfo(){
        System.out.println("Welcome to the Student class!!!");
    }
    
    void abc() {
        a++;
       count++;
    }
    
    static void abcd () {
        count++;
        Student St2 = new Student("Petr", 2);
        St2.a++;
    }
        public static void main(String[] args) {
            
        abcd();
        Student St3 = new Student("Ivan", 1);
        St3.abc();
        
  
        // Student st1 = new Student("Ivan", 2);
        // Student st2 = new Student("Petr", 4);
        // Student st3 = new Student("Masha",1);
        // System.out.println(st1.name);
        // System.out.println(count);
        // System.out.println(st1.count);
        // System.out.println(st2.count);
        // System.out.println(st3.count);
        // showCount();
        // st2.showCount();
        
    }
    
}

class StudentTest {

    
    
}