
package lesson2;


public class PrimitiveDataTypes {
    
    public static void main (String [] args) {
    
    byte b1 = 10;
    byte b2 = 20;
    byte b3 = 100;
    
    short s1 = 5;
    short s2 = -10;
    short s3 = 0;
    
    int i1 = 500;
    
    long l1 = 1000;
    long l2 = 10000000000L;
    long l3 = 100000000000l;
    
    float f1 = 3.14f;
    float f2 = 2.5F;
    float f3 = 20;
    float f4 = 20.0F;
    
    double d1 = 3.5d;
    double d2 = 87.65D;
    double d13 = 3.6;
    
    char c1 = 'a';
    char c2 = 'Ъ';
    char c3 = '7';
    char c4 = ' ';
    
    char c5 =1280; //10ричная система исчисления
    char c6 = '\u0500';//16ричная система исчисления
    
   boolean bool1 = true;
   boolean bool2 = false;
    
   int a1 = 60; // десятиричная система счисления
   int a2 = 0B111100; //двоичная система счисления. 0B означает, что идущее после него число находится в двоичной системе счисления.
   int a3 = 0b111100; //двоичная система счисления. 0b означает, что идущее после него число находится в двоичной системе счисления.
   int a4 = 074; // восьмиричная система счисления.
   int a5 = 0x3c; // шестнадцатиричная система счисления. перед числом пишется 0x.
   int a6 = 0X3C; // шестнадцатиричная система счисления. перед числом пишется 0X.
   int a7 = 1_000_000; // underscore _ испоользуется для удобного деления значений переменных, но он не выводится в аутпуте.
   
    System.out.println("b1");
    System.out.println(c2);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(bool1);
    System.out.println(bool2);
    
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    System.out.println(a4);
    System.out.println(a5);
    System.out.println(a6);
    System.out.println(a7);
    
    
    
    
    
    
    
    }
            
            
}
