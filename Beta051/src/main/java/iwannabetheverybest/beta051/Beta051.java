/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iwannabetheverybest.beta051;

import java.util.Scanner;

/**
 *
 * @author Astil Paradox
 */
public class Beta051 {

    public static void main(String[] args) {
           Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        do{
       
              num=num+1;
        
             if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
             
          } while (num<500);
    }
}
