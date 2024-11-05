import java.util.Scanner;
  public class IT24103856Lab3Q2 {
  public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  
  System.out.print("enter the monthly salary: ");
  double monthlySalary=input.nextDouble();
  
  System.out.print("enter the number of ot hours: ");
  int otHours=input.nextInt();
  
   System.out.print("enter the  ot hourly rate: ");
   double otHourlyRate=input.nextDouble();
   
   //calculate ot amount
   double otAmount=otHours*otHourlyRate;
   
   //caculate total salary
   double totalSalary=monthlySalary+otAmount;
   //print total salary
   System.out.println("total salary is: " + totalSalary);
   
     }
   }