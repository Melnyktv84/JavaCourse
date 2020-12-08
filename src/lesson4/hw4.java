
package lesson4;


public class hw4 {
    
}

class Student1 {
  
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
      
        
       Student St1 = new Student();
       
       St1.CardNumber = 1;
       St1.Name = "Liza";
       St1.Surname = "Wood";
       St1.StudyYear = 2018;
       St1.MathAverage = 4.9;
       St1.EconomyAverage = 4.5;
       St1.ForeignLanguageAverage = 4.9;
       
      
       
       Student St2 = new Student();
       
       St2.CardNumber = 2;
       St2.Name = "Li";
       St2.Surname = "Smit";
       St2.StudyYear = 2019;
       St2.MathAverage = 4.3;
       St2.EconomyAverage = 4.0;
       St2.ForeignLanguageAverage = 5.0;
       
       Student St3 = new Student();
       
       St3.CardNumber = 3;
       St3.Name = "Peter";
       St3.Surname = "Klop";
       St3.StudyYear = 2020;
       St3.MathAverage = 5.0;
       St3.EconomyAverage = 4.9;
       St3.ForeignLanguageAverage = 3.9;
       
       StudentTest STest = new StudentTest();
       STest.AverageGrade(St1);
       STest.AverageGrade(St2);
       STest.AverageGrade(St3);
       
       
         // System.out.println(Student1.Name + " " + Student1.Surname + " average grade: "+(Student1.MathAverage+Student1.EconomyAverage+Student1.ForeignLanguageAverage)/3+".");
         // System.out.println(Student2.Name + " " + Student2.Surname + " average grade: "+(Student2.MathAverage+Student2.EconomyAverage+Student2.ForeignLanguageAverage)/3+".");
         // System.out.println(Student3.Name + " " + Student3.Surname + " average grade: "+(Student3.MathAverage+Student3.EconomyAverage+Student3.ForeignLanguageAverage)/3+".");
      
  }
    
    
}

