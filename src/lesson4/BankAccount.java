
package lesson4;

public class BankAccount {
    
    int id = 10; // instance variable - переменная экземпляра, относится к каждому созданному объекту
   // String name = "Petr"; // instance variable
   String name = new String("Petr");
    double balance = 100.0; //instance variable
    
    
    void popolnenieScheta(double summaPopolneniya) {
    System.out.println("Balance do popolneniya: "+ balance);
    System.out.println("Banalce popolniaetsia na: " + summaPopolneniya);
    balance+= summaPopolneniya;
    System.out.println("Balance posle popolneniya: "+balance);
    System.out.println();  
    }
  
    void snyatieSoScheta(double summaSnyatiya) {
    System.out.println("Balance do snyatiya: "+ balance);
    System.out.println("S balansa snimaetsya: " + summaSnyatiya);
    balance-= summaSnyatiya;
    System.out.println("Balance posle snyatiya: "+balance);
    System.out.println();  
    }
        
 
}



class BankAccountTest{
    
    public static void main (String[] args){
    BankAccount MyAccount = new BankAccount(); // new обозачает, что сейчас будет создаваться новый объект. Пересенная bA содержит адрес, а не объект. Sozdali 1-i obekt
    MyAccount.popolnenieScheta(30.5);
    MyAccount.snyatieSoScheta(20.5);







// BankAccount YourAccount = new BankAccount(); // Sozdali 2-i obekt
    // BankAccount HisAccount = new BankAccount(); // Sozdali 3-i obekt
    
    // MyAccount.id=1;
    // MyAccount.balance=12.35;
   
   
    
    // System.out.println(MyAccount.id);
    // System.out.println(MyAccount.name);
    // System.out.println(MyAccount.balance);
    
       
    // System.out.println();
     
    // YourAccount.id=2;
    // YourAccount.name="Mike";
    // YourAccount.balance=2.00;
  
    
    // System.out.println(YourAccount.id);
    // System.out.println(YourAccount.name);
    // System.out.println(YourAccount.balance);
    
    // System.out.println();
     
    // HisAccount.id=3;
    // HisAccount.name="Ivan";
   //  HisAccount.balance=124.12;
    
    
    
    //System.out.println(HisAccount.id);
    // System.out.println(HisAccount.name);
    //System.out.println(HisAccount.balance);
  
    
    // System.out.println();
    }
    
}