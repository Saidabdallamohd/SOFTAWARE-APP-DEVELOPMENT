import java.util.Scanner;
  class Qstn14 {
      public static void main (String []args){
          Scanner scanner = new Scanner (System.in);
          
          System.out.println("Enter your first name");
          String Name = scanner.nextLine();

          System.out.println("Enter your last name");
           String lName = scanner.nextLine();
          System.out.println("Welcome " + Name + " " + lName + "!" );
      }  
      
  }