import java.util.Scanner;
 class Question01{
  public static void  main(String[] args) {
    Scanner record = new Scanner (System.in);

        System.out.print("Enter your name:");
         String name = record.nextLine();
          System.out.println("Your name is : " + name); 

            System.out.print("Enter your address : ");
             String myaddress = record.nextLine();
              System.out.println("Your address :" + myaddress);

            System.out.print("Enter  your city : ");
           String city = record.nextLine();
          System.out.println("Your home city is : " + city);

       System.out.print("Enter  your state : ");
     String state = record.nextLine();
   System.out.println("You are citizen from : " + state);

System.out.print("Enter a yuor ZIP : " );
   int myzip = record.nextInt();
     System.out.println(" Your ZIP is : " + myzip);

           System.out.print("Enter your telephone number :");
             long phoneno = record.nextInt();
               System.out.println(" Your phone number is : "  + phoneno);

                   System.out.printf("Enter your Collage : ");
                     String mycollege = record.nextLine();
                       System.out.println("You are studying in : " + mycollege);
  }
}