/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;


public class HelloWorldMike {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //lesson 1
    /**    System.out.println("What is your name?");
        String abc=input.nextLine();
        System.out.printf("hello, %s tadukar\n",abc);
    
       System.out.println("Where do you live?");
       String xyz=input.nextLine();
       System.out.printf("I live in %s \n",xyz);
       
       System.out.println("What is your phone number");
       String asd;
       asd ="9860325215";
       System.out.printf("My phone number is %S \n ",asd);
       
       System.out.println("Gender");
       String xcv=input.nextLine();
       System.out.printf("Gender = %s \n", xcv);
       * */
       
       
       //lesson 2
      /**                   
                    String name= "Niba" , heshe="";
                    double gpa=3.59;
                    int age=41, retirement= 70, daystill= 0;
                    boolean isFemale;
                 System.out.print("Enter your name:");
                 name = input.nextLine();
                 System.out.print("Enter your age :");
                 age= input.nextInt();
                 System.out.print("enter your gpa:");
                 gpa= input .nextDouble();                  
                 
                 System.out.print("Are you female ? (true/false):");
                 isFemale = input.nextBoolean();
                 
                 heshe = isFemale? "She" : "He";
                 
                 daystill = retirement - age;
                 
                 System.out.printf("%s is %d years old(%d years to retirement). %s has a %4.3f gpa. \n"
                         ,name,age,daystill,heshe,gpa);
               */     
       
     //  lesson 3
     
/**            String x = "1";
    String y = "2";
                 System.out.println(x + y);
    
    String firstname = "Niba";
    String lastname = "Tandukar";
           System.out.println(firstname + " " + lastname + " " + "!!!!!");
    
    int i = Integer.parseInt(x);
    int j = Integer.parseInt(y);
    
    System.out.println(i+j);
    
    String gpa = "3.96";
    double gpa2 = Double.parseDouble(gpa);
    
    System.out.println(gpa2 - 1.0);
    
   */
   
   //Understanding type casting
    
        //20/15 == 1.3333333333
   int x = 20;
   int y = 15;
   int i = x/y;  //int / int ==> int
   double d1 = x/y;    //int / int ==> int ==> double
   double d2 = x/(1.0 *y); // int /(double * int ) ==> double
   double d3 = (double)x / y; // int / double ==> double
   
   
   System.out.println(i);
   System.out.println(d1);
    System.out.println(d2);
     System.out.println(d3);
     
     double w=3.65;
     
    
 
      
    }
}

