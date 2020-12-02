
package lesson3;


public class test6 {
    public static void main (String[] args) {
        int a =3;
        int b = 5;
        int c = 5;
        
      boolean b1 = a>=b;
      boolean b2 = b<=c;
      boolean b3 = c==b;
      boolean b4 = c!=b; 
      
      System.err.println(b1); 
      System.out.println(3>5);
      System.out.println(b2);
      System.out.println(b3);
      System.out.println(c==b);
      System.out.println(b4);
      System.out.println();
      
      boolean x = true;
      boolean y = false;
      boolean z = true;
      
      boolean result = x&&y&&z;
      boolean result1 = x||y||z;
      
      System.out.println(result);
      System.out.println(result1);  
    } 
    
}
