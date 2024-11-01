
import java.util.Scanner;
public class IT24103856Lab3Q1B{
   public static void main(String args[]){
          //declare variable
    double  unit_price,kilograms,amount,discount_price;
     Scanner wholesale= new Scanner(System.in);
            
            System.out.println("enter the number of kilogram:");
             kilograms=wholesale.nextDouble();
            
                System.out.println("enter the unit of price:");
             unit_price=wholesale.nextDouble();
          
        amount=unit_price*kilograms;
        System.out.println("the amount you have to pay lkr:"+amount);
       
        discount_price=amount-((amount*10)/100);
        System.out.println("the amount you have to pay lkr:"+ discount_price);

         
      }
  }