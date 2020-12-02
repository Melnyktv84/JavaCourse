
package lesson8;

public class hw8_2 {
    public static final double Pi = 3.14;
    
    public double ploshadKruga(double radius){
        return Pi*radius*radius;
    }
    
    public static double dlinaOkrujnosty(double radius1) {
        
        return 2*Pi*radius1;
        
    }
    
    public void ShowInfo(double radius2){
        System.out.println("Radius: " + radius2);
        System.out.println("Ploshad Kruga: " + ploshadKruga(radius2));
        System.out.println("Dlina okrujnosty: " + dlinaOkrujnosty(radius2));
    }
    
}

class test{

public static void main(String[] args){
   
    hw8_2 test = new hw8_2();
    
    System.out.println("Ploshad kruga:" + test.ploshadKruga(15));
    System.out.println();
    System.out.println("Dlina okrujnosty: "+ hw8_2.dlinaOkrujnosty(27.7));
    System.out.println();
    test.ShowInfo(300.5);
    
    
}    
   
}