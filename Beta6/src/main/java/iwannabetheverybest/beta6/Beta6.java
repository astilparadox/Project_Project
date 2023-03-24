/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iwannabetheverybest.beta6;

import java.util.Scanner;

/**
 *
 * @author Astil Paradox
 */
public class Beta6 {

      
     

           
    	public static int total_quantity=0;
    	public static String[] products = {null, "1.) Hawaiian Classic 169.00",
    	 											"2.) Domino's Deluxe 419.00",
    	 											"3.) Extravagazza 469.00",
    	 											"4.) Pizza Carbonara 469.00"};
    	public static int[] product_price ={0,169,419,469,469};
    	public static int[] final_qty=new int[5];
     
    	public static void main(String[] args)
    	{   
    		Scanner s = new Scanner(System.in);
    		int choose, quantity;
    		int p1=0;
    		int p2=0;
    		int p3=0;
    		int p4=0;
    		char decision;
    		System.out.println("Welcome to Dominos Pizza, please choose any from the menu there..");
    		do
    		{
     
    			for(int i = 0; i < products.length; i++)
    			{
    				if(products[i] != null)
    				System.out.println(products[i]);
    			}
     
    			System.out.print("Choose any item: ");
    			choose=s.nextInt();
     
    			System.out.print("How many orders? ");
    			quantity=s.nextInt();
     
    			switch(choose)
    			{
    				case 1:
    				p1 += quantity;
    				final_qty[1]=p1;
    				break;
     
    				case 2:
    				p2 += quantity;
    				final_qty[2]=p2;
    				break;
     
    				case 3: 
    				p3 += quantity;
    				final_qty[3]=p3;
    				break;
     
    				case 4: 
    				p4 += quantity;
    				final_qty[4]=p4;
    				break;
    			}
    			System.out.print("Would you like to order again? Y/N / y/n: ");	
    			decision=s.next().charAt(0);
    		}while(decision != 'n' && decision != 'N');
     
    		System.out.println("==Final Cart==");
    		System.out.println("\t\\Item\t\\Qty\t\\Total");
    		int sum=0;
    		for(int i=0; i < final_qty.length; i++)
    		{
    			if(final_qty[i] != 0)
    			{
    				System.out.println(products[i]+"\\"+final_qty[i]+"\\"+final_qty[i]*product_price[i]);
    				sum = sum + final_qty[i]*product_price[i];
    			}
    		}
    		System.out.println("Total Purchased items: "+(p1+p2+p3+p4));
    		System.out.println("Total Purchase: "+sum);
    		int payment=0;
                
                
                
                                    do
    		{
    		System.out.print("Enter Payment: ");
                                   payment=s.nextInt();
                                   if (payment < sum)
                                   System.out.println("Not enough payment, pay up");
                                   }
                                    while(sum >= payment);
    		System.out.println("Thank you for buying! here's your change: "+(payment-sum));	
                              
    	}	
     
    }
