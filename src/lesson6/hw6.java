
package lesson6;

public class hw6 {
    
    
}

class SummaChishel {
    
    int summa(){
        int result=0;
        System.out.println("Summa vseh chisel: " + result);
        return result;
    }
     
    int summa(int a){
        int result=a;
        System.out.println("Summa vseh chisel: " + result);
        return result;
    }
    int summa(int a1, int b1){
        int result=a1+b1;
        System.out.println("Summa vseh chisel: " + result);
        return result;
    }
    int summa(int a2, int b2, int c2){
        int result=a2+b2+c2;
        System.out.println("Summa vseh chisel: " +result);
        return result;
    }
    int summa(int a3, int b3, int c3, int d3){
        int result=a3+b3+c3+d3;
        System.out.println("Summa vseh chisel: " + result);
        return result;   
    }   
    
}

class SummaChishelTest{
    public static void main(String[] args){
        
      SummaChishel SumChiselTest = new SummaChishel();
      
      SumChiselTest.summa();
      SumChiselTest.summa(1);
      SumChiselTest.summa(1, 2, 3, 4);
      SumChiselTest.summa(5, 10, 15, -20);
      SumChiselTest.summa(0, 20, 10, 10);
      
        
        
    }
    
  
    
}
