/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iwannabetheverybest.beta3;

import java.util.Scanner;

/**
 *
 * @author Astil Paradox
 */
public class Beta3 {

    public static void main(String[] args) {
        
       
         
    Scanner z = new Scanner(System.in);
        double w,y;
        int x;
        
        System.out.println("Input any number: ");
        w=z.nextDouble();
        System.out.println("Choose a number: \n \n \n [1] [2] [3]");
        x=z.nextInt();
        
        switch(x){
            case 1: 
                y=Math.pow(w, 9)-8*w+90;
                System.out.println("The answer is: "+y);
                
            case 2:
                y=Math.sqrt(Math.pow(w, 3)+7)+2;
                System.out.println("The answer is: "+y);            
                
            case 3:
                y=((w*2)+100)/Math.sqrt(w)+8;
                System.out.println("The answer is:" +y);
                
        Scanner input = new Scanner(System.in);
        input a=z;
                
      
        
        }
   
    }
}
