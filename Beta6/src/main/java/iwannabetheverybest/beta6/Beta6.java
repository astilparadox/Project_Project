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

    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
     System.out.println("\t\t\t\t   1. Barnuts                         Php. 7.00");
    System.out.println("\t\t\t\t   2. Ferrero Rocher                   Php. 52.00");
    System.out.println("\t\t\t\t   3. Hany                              Php. 8.00");
    System.out.println("\t\t\t\t   4. ChocoMani                         Php. 8.00");
    System.out.println("\t\t\t\t   5. Cadbury                         Php. 25.00");
    System.out.println("\t\t\t\t   6. CANCEL                         ");
     }
    
    public static void order(){
    System.out.println("Press 1 for Barnuts , Press 2 for Ferrero Rocher , Press 3 to Hany , Press 4 for ChocoMani , Press 5 for Cadbury, Press 6 to Cancel");
    System.out.print("Press you want to buy? :");
    choose = input.nextInt();
        //conditions
        switch (choose) {
            case 1:
                System.out.println("You choose Option 1");
                System.out.print("Quantity of items :");
                quantity =input.nextInt();
                total = total +(quantity*45);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
            case 2:
                System.out.println("You choose Option 2");
                System.out.print("Quantity of items :");
                quantity =input.nextInt();
                total = total +(quantity*40);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
            case 3:
                System.out.println("You choose Option 3");
                System.out.print("Quantity of items :");
                quantity =input.nextInt();
                total = total +(quantity*30);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
                 case 4:
                System.out.println("You choose Option 4");
                System.out.print("Quantity of items :");
                quantity =input.nextInt();
                total = total +(quantity*30);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
                case 5:
                System.out.println("You choose Option 5");
                System.out.print("Quantity of items :");
                quantity =input.nextInt();
                total = total +(quantity*30);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
            case 6:
                System.exit(0);//close program
            default:
                System.out.println("Choose 1 to 4 only!");
                order();
                break;
        }
    }
    public static void main(String[] args) {
       menu();
       order();
 
}

}
    
 