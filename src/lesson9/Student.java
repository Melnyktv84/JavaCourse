
package lesson9;

public class Student {
    
}

class StudentTest {
    
    public static void main(String[] args){
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3; // ссылка на создание объекта
        st1 = null; // жизнь данного объекта закончилась либо можно написать st1 = new Student(), что тоже значит, что жизнь данного объекта по старому адресу закончилась и появился объект по новому адресу
        String s = "privet!";
    }
}
