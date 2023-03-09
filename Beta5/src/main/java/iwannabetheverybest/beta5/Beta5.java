/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iwannabetheverybest.beta5;

import java.util.Scanner;

/**
 *
 * @author Astil Paradox
 */
public class Beta5 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
         
        
       
       int a = 1;
       int fact= 1;
        int  i= 1;
       
       System.out.println( a);
       
         
         do {
          
             
                a=a+1  ;
               
             
 
             
                
                
       
           
       if (a %2==0) {  System.out.println( a +" (even)");  do {   
                
              fact= fact* i;
 
                 i++;    }
                     while ( i <= a); 
         System.out.println(" The factorial  of the given number " +a +" ! is " + fact);}
             
      
                else  {  System.out.println(a +" (odd)  ");
                
              do {   
                 
              fact= fact* i;
 
                 i++;    }
                     while ( i <= a); 
         System.out.println(" The factorial  of the given number " +a +" ! is " + fact);
        
      
              
     
       
       
       }  
               
   }  while(a <17);  
     
     
      
  
              
          
     
         
         
         

    }
       
         
    
         
         
      
      
        
           
           
           }




       



