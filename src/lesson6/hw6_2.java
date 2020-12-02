
package lesson6;


public class hw6_2 {
    
}

class Student {
    
 
    
  Student(int CardNumber1, String Name1, String Surname1, int StudyYear1, double MathAverage1, double EconomyAverage1, double ForeignLanguageAverage1){
      
      CardNumber=CardNumber1;
      Name=Name1;
      Surname=Surname1;
      StudyYear=StudyYear1;
      MathAverage=MathAverage1;
      EconomyAverage=EconomyAverage1;
      ForeignLanguageAverage=ForeignLanguageAverage1;
  }
  
  Student(int CardNumber2, String Name2, String Surname2, int StudyYear2) {
      
      this (CardNumber2, Name2, Surname2, StudyYear2, 0.0, 0.0, 0.0);
  }
  
  Student(){
      
  }

   int CardNumber;  
  String Name;
  String Surname;  
  int StudyYear;
  double MathAverage;
  double EconomyAverage;
  double ForeignLanguageAverage;

  }
  
  

class StudentTest {
    
     double AverageGrade(Student a) {
     double SredOcenka = (a.MathAverage+a.EconomyAverage+a.ForeignLanguageAverage)/3;
     System.out.println("Average Grade " + a.Name + " " + a.Surname +":" + SredOcenka);
     return SredOcenka;
  }    
     
  public static void main (String[] args){
      
     StudentTest AveGrade1 = new StudentTest();
       
       
     Student Student1 = new Student(1, "Petr", "Ivanov", 2015, 5.0, 4.3, 4.0);
     System.out.println("Id: " + Student1.CardNumber +", name: " + Student1.Name + ", surname: " + Student1.Surname + ", study year: " + Student1.StudyYear + ", mathAverage: " + Student1.MathAverage + ", economyAverage: " + Student1.EconomyAverage + ", foreignLanguageAverage: " + Student1.ForeignLanguageAverage);
     
   
     
     AveGrade1.AverageGrade(Student1);
     System.out.println();
     
     
     Student Student2 = new Student(2, "Sergey", "Kvasov", 2016);
     Student2.EconomyAverage = 4.5;
     Student2.MathAverage = 3.9;
     Student2.ForeignLanguageAverage = 5.0; 
     System.out.println("Id: " + Student2.CardNumber +", name: " + Student2.Name + ", surname: " + Student2.Surname + ", study year: " + Student1.StudyYear);
     
     AveGrade1.AverageGrade(Student2);
     System.out.println();
      
     Student Student3 = new Student();
     System.out.println("Id: " + Student3.CardNumber + ", name: " +Student3.Name);
     AveGrade1.AverageGrade(Student3);
  }

}