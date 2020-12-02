
package lesson8;

public class test1 {
    
    public final int a; // a - instance variable (переменная экземпляра)
    
    test1(){
    a = 10;    
    }
    
    test1(boolean b){
    a = 15;    
    }
    
    public void abc(final short s){
       final byte b; // b -локальная переменная, она не видна не в нутри этого метода
       b = 10;
        System.out.println(s+b);
        
    }
    
    public static void main (String[] args) {
        
        test1 t = new test1();
       
        System.out.println(t.a);
        
        
    }
    
}
