import java.util.Scanner;
 class Qstn7{
     public static void main(String [] args){
         Scanner input = new Scanner(System.in);

        System.out.println("Enter number of miles");
        int amount = input.nextInt();

        System.out.println("Gallons of gas ");
        int gram= input.nextInt();

        int Miles = amount/gram;
        System.out.println("Result  " + Miles);
        int No_of_gallons = gram/amount;
        
        System.out.println("Result  " + No_of_gallons ); 
        
     }
 }