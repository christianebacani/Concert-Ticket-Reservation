// Concert Ticket Reservation
// Created by Christiane A. Bacani

import java.util.Scanner;

public class ConcertTicketReservation {
    public static void main(String[] args) {
        
        // Initialize Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Initialize variables for ticket selling and total price
        boolean sell = true;
        int total = 0;
        
        // Initialize array of ticket prices
        int price[] = {2500,2000,1500,1000};
       
        // Prompt user to press enter to start
        System.out.print("Press enter to start : ");
        String presEnter = input.nextLine();
       
        // Display options to user
        System.out.print("1.) Buy a concert ticket\n");
        System.out.print("2.) About\n");
        System.out.print("3.) Exit\n");
       
        // Prompt user to enter choice
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
       
        // Handle user choice using switch statement
        switch(choice){
            case 1:
                // Loop until user decides to stop buying tickets
                while(sell){
                      
                    // Display available tickets and prices
                    System.out.print("   AVAILABLE TICKETS\n\n");
                    System.out.print("TICKETS\t\tPRICE\n\n");
                    System.out.print("1.) VIP\t\tP 2500\n\n");
                    System.out.print("2.) Reserved\tP 2000\n\n");
                    System.out.print("3.) Early Bird\tP 1500\n\n");
                    System.out.print("4.) Gen Ad    \tP 1000\n\n");
               
                    // Prompt user to choose a ticket
                    System.out.print("Enter your choice here : ");
                    int userChoice = input.nextInt();
               
                    // Prompt user to enter ticket quantity
                    System.out.print("Enter the quantity of your tickets : ");
                    int quantity = input.nextInt();
               
                    // Update total price with selected ticket and quantity
                    total += price[userChoice - 1] * quantity;
               
                    // Ask user if they want to buy more tickets
                    System.out.print("Do you want to buy more tickets? (y/n): ");
                    input.nextLine();
                    String buyMore = input.nextLine();
               
                    // If user doesn't want to buy more tickets, stop selling and print receipt
                    if(buyMore.equalsIgnoreCase("n")){
                        sell = false;
                   
                        System.out.print("Total price is: P " + total + "\n");
                   
                        System.out.print("Enter your payment here : p ");
                        int payment = input.nextInt();
                  
                        // Calculate change and display it to user
                        int change = payment - total;
                  
                        System.out.print("Change : P " + change + "\n");
                        System.out.print("\n\nTHANK YOU FOR PURCHASING OUR CONCERT TICKET/S!!!");
                    }
               
                }
                break;
               
            case 2:
                // Display information about the ticket reservation system
                System.out.print("\n\nOUR ONLINE CONCERT TICKET RESERVATION/BUYING SYSTEM IS AN ONLINE PLATFORM\nTHAT AIMS TO ENSURE THE FASTEST AND QUALITY SYSTEM OF BUYING/RESERVATION OF ONLINE TICKETING SYSTEM");
                break;
               
            case 3:
                // Exit the program
                System.out.print("\n\n---EXITING---");
                break;
               
            default:
                // Handle invalid choice
                System.out.print("\n\nINVALID CHOICE!");
        }
            
    }
}

