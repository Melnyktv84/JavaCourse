
package lesson9;

public class Hw9 {
   
    static int count;
   public String name;
   
   
   Hw9(String name){
       this.name = name;
       count++;
       System.out.println(count +" imya: " +name);
   }
   
   public static void main(String[] args){
       
       Hw9 name1 = new Hw9("Ivan");
       Hw9 name2 = new Hw9("Petr");
       Hw9 name3 = new Hw9("John");
       Hw9 name4 = new Hw9("Liya");
       Hw9 name5 = new Hw9("Elena");
       Hw9 name6 = new Hw9("Sviatoslav");
       String name7="Leonid";
     
       name1 = null;
       name2=new Hw9("Liza");
       name3=null;
       name4=null;
       name5=null;
       name6=null;
      
   }
    
}
