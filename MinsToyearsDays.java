import java.util.Scanner;
 class MinsToyearsDay{
     public static void main(String [] args){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number of minutes: ");
         long minutes = input.nextInt();

         

         long x = 365;
         long y = 24;
         int hours = x * y;
         int minutes = y / x;           

     }
 }