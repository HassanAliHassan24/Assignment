import java.util.Scanner;
  class Q15{
      public static void main(String []args){
        
          Scanner scanner = new Scanner (System.in);

          System.out.println ( "What's your first_name ?" );
          String firstName = scanner.nextLine();

          System.out.println ( "What's your last_name ?" );
          String lastName = scanner.nextLine();

          System.out.println ( "What's your age" );
          int age = scanner.nextInt();
           System.out.println("Welcome " + firstName  + " " + lastName + " " + "You are     seconds old! " );

      }
  }