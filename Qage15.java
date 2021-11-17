import java.util.Scanner;
  class Qage15{
      public static void main(String []args){
        
          Scanner name = new Scanner (System.in);

          System.out.println ( "What's your first name ?" );
          String firstName = name.nextLine();

          System.out.println ( "What's your last name ?" );
          String lastName = name.nextLine();

          System.out.println ( "What's your age" );
          int age = name.nextInt();
           System.out.println("Welcome " + firstName  + " " + lastName + " " + "You are "+age+" seconds old! " );

      }
  }
