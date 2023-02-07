/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_project;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Project_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner input = new Scanner (System.in);
            System.out.println("Enter any number to proceed");
            int a = input.nextInt();
            System.out.println(a);
            
            if (a >= 1 && a <= 10) {
                System.out.println("numbers between 1 and 10");
                System.out.println("Enter to numbers");
                System.out.println("Enter number 1");
                int x = input.nextInt();
                System.out.println("Enter number 2");
                int y = input.nextInt();
                
                int sum=x+y;
                System.out.println("The sum is:" +sum);
                
            } else if (a >= 11 && a <=  20) {
                 System.out.println("numbers between 11 and 20");
                System.out.println("Enter to numbers");
                System.out.println("Enter number 1");
                int x = input.nextInt();
                System.out.println("Enter number 2");
                int y = input.nextInt();
                
                int difference=x-y;
                System.out.println("The difference is:" +difference);    
     
            } else if (a == 21 || a == 22) {
                    System.out.println("numbers 21 or 22");
                System.out.println("Enter to numbers");
                System.out.println("Enter number 1");
                int x = input.nextInt();
                System.out.println("Enter number 2");
                int y = input.nextInt();
                
                int product=x*y;
                System.out.println("The product is:" +product);
          
            } else if (a == 31 || a == 33) {
                    System.out.println("numbers 31 or 33");
                System.out.println("Enter to numbers");
                System.out.println("Enter number 1");
                int x = input.nextInt();
                System.out.println("Enter number 2");
                int y = input.nextInt();
                
                int quotient=x/y;
                System.out.println("The quotient is:" +quotient);
              
            
            }
            


    }
            
    
    

