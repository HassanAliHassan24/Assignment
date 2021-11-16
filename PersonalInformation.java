import java.util.Scanner;
 class Exercise1{
  public static void  main(String[] args) {
    Scanner scanner = new Scanner (System.in);
      //Input name
        System.out.print("Please enter your name:");
         String name = scanner.nextLine();
          System.out.println("Your name is : " + name); 

           // Input address
            System.out.print("Enter your address : ");
             String myaddress = scanner.nextLine();
              System.out.println("Your address :" + myaddress);

             // Display city
            System.out.print("Fill your city : ");
           String city = scanner.nextLine();
          System.out.println("Your home city is : " + city);

        //Display State
       System.out.print("Fill your state here : ");
     String state = scanner.nextLine();
   System.out.println("You are citizen from : " + state);

  //ZIP code
System.out.print("Enter a ZIP : " );
   int myzip = scanner.nextInt();
     System.out.println(" Your ZIP is : " + myzip);

          // Telephone number
           System.out.print("We recommend to get your telephone number :");
             long phoneno = scanner.nextInt();
               System.out.println(" Your phone number is : "  + phoneno);

                 //Inserting a college
                   System.out.printf("What is your collge that you are stadying rigt now : ");
                     String mycollege = scanner.nextLine();
                       System.out.println("You are studying in : " + mycollege);
                         scanner.close();




            
    }
}