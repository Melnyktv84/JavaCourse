
package lesson8;

public class hw8 {
    
    public static int umnogenye(int a1, int b1, int c1) {
        
        return a1*b1*c1;
        
    }
    
    public static void delenie (int a2, int b2) {
        
        System.out.println("Celoe chastnoe: "+ (a2/b2));
        System.out.println("Ostatok: "+ (a2%b2));
        
    }
    
}

class test {
    public static void main(String[] args) {
        
        System.out.println("Rezultat umnogeniya 1: " + hw8.umnogenye(2,3,4));
        
        System.out.println("Rezultat umnogeniya 2: " + hw8.umnogenye(-10, 25, -5));
        
        System.out.println();
        
        hw8 deleniye1 = new hw8();
        deleniye1.delenie(5,2);
       
        hw8.delenie(-10, 7);
        
    
        
    } 
    
    
    
}


