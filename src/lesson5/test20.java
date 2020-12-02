
package lesson5;

public class test20 {
    
    int summa(int a, int b, int c) { // int a, int b, int c - parametry
    int result = a+b+c;
    return result;    
    }
    
    int sredneeArifm(int a1, int b1,int c1) {
        
        int result2=summa(a1,b1,c1)/3;
        return result2;
    }
    
}

class test21 {
    public static void main (String[] args) {
        
       test20 t = new test20();
       int summaTrexChisel = t.summa(1,2,3); // 1,2,3 - argumenty
       System.out.println(summaTrexChisel);
       System.out.println(t.summa(5,10,15));// 5,10,15 - argumenty
       System.out.println(t.sredneeArifm(20,40,60));
        
    }
    
}