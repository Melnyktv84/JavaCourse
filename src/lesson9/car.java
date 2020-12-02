
package lesson9;


public class car {
    
    // int zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz =5;
    // int _Bk990 = 0;
    // int $___8kk_______000 = 0;
    // int String = 2;
    

    
    
    String color;
    int a = 10;
    String engine;
    static int count;
    
   /* public static void ChangeA(int b) {
        car c = new car("black", "v8");
        c.a = b;
    }*/
    
    car(String color, String engine) {
       // int x = 5; // локальная переменная. У локальных переменных дефолтных значений не бывает.
        // int y = x+10; //  локальная переменная
        this.count++;
        this.color=color; /* в данном случае перед переменными объекта мы обязаны писать ключевое слово this. 
Когда вы пишете this, вы имеете ввиду, что используете color, который принадлежит объекту. А color, который вы используете без this будет принадлежать параметру.*/
        this.engine=engine;
    }
    
   void changeColor(String color) {
       System.out.println(color);
       
   }
   
   public static void main(String[] args){
       car c = new car("red", "v6");
       System.out.println(c.color);
       c.changeColor("black");
       System.out.println(c.color);
       
   }
}
