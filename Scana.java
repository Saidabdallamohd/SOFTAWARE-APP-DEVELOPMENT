import java.util.Scanner;
class Scana{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = input.nextLine();
        System.out.println("Enter your Age?");
        int age = input.nextInt(); 
        System.out.println("Where you live? ");
        String city = input.next();
        System.out.println("Enter your Collage ");
        String collage = input.next();
        System.out.println("Enter your Proffesion ");
        String proffesion = input.next();
        System.out.println("Enter your Animal ");
        String animal = input.next();
        System.out.println("Enter a pet's name ");
        String pet = input.next();
        System.out.println("There once was a person named "+name+ " who live in "+city+ " At the age of "+age+","+name+" went to collage at "+collage+"."+name+" graduated and went to work as a "+proffesion+". Then, "+name+" adopted a(n) "+animal+" named "+pet+". They borth lived happily ever after!");
        
    }
}