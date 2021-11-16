import java.util.Scanner;
  class Eggs{
      public static void main( String []args){
        Scanner input = new Scanner (System.in);
        int N_eggs = 144;
        int dozen_of_eggs = 12;
        int number_of_eggs  = N_eggs/dozen_of_eggs;
        System.out.println( "number of eggs is" + number_of_eggs);
        int dozen = N_eggs % dozen_of_eggs;
        System.out.println(" dozen " + dozen);

        
       System.out.print("How many eggs that you have  ");
       int num_of_eggs = input.nextInt();
        num_of_eggs = num_of_eggs / 12;
       System.out.println("Your number of eggs" + num_of_eggs);

       System.out.print("Enter a number of dozen that you have ");
       int N_dozen = input.nextInt();
       N_dozen =  N_dozen % 12;
       System.out.println( dozen +  " is N_dozen");
       

      }
  }