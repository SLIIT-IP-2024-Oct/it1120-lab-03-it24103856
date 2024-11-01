
import java.util.Scanner;
public class IT24103856Lab3Q1A{
   public static void main(String args[]){
          //declare variable
    double  unit_price,kilograms,amount;
     Scanner wholesale= new Scanner(System.in);
            
            System.out.println("enter the number of kilogram:");
             kilograms=wholesale.nextDouble();
            
                System.out.println("enter the unit of price:");
             unit_price=wholesale.nextDouble();
          
        amount=unit_price*kilograms;
        System.out.println("the amount you have to pay lkr:"+amount);
      }
  }