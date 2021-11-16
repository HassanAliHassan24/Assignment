import java.util.Scanner;
class QuotientReminder{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
         System.out.println("input a first int :");
        int x =input.nextInt ();
        
         System.out.println("input a second int :");
        int y = input.nextInt ();
        int quotient = x / y;
          System.out.println("Quotient = " + quotient);
        int reminder = x % y;
        System.out.println("Reminder = " + reminder);
    }
}