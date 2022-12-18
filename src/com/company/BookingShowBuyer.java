package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingShowBuyer {
    ArrayList<List<Integer>> buyerDetailsArrayList = new ArrayList<>();
    private int contactNo;
    private int roomID;
    private int selectedRow;
    private int selectedCol;
    Scanner in = new Scanner(System.in);

    BookingShowAdmin bookingShow = new BookingShowAdmin();

    public void buyerOptions() {
        System.out.println("Choose an option from the menu ");
        System.out.println("1.Book a Ticket\n2.View Booking\n3.Check Availability\n4.Cancel a Ticket");
        int buyerInput = in.nextInt();

        switch (buyerInput) {
            case 1: ticketBooking();
            case 2: ticketBooking();
            case 3: bookingShow.viewShowRoom();
        }
    }

    void ticketBooking() {
        System.out.println("Enter your Contact Number");
        contactNo = in.nextInt();
        System.out.println("Select Show Room");
        roomID = in.nextInt();
        System.out.println("Choose row number");
        selectedRow = in.nextInt();
        System.out.println("Choose Column number");
        selectedCol = in.nextInt();
        int ticketID = (int)(Math.random()*9000-1000+1);
        //if(!bookingShow.checkShowAvailability(roomID, selectedRow, selectedCol)) {
            System.out.println("The seat is booked successfully, kindly see the details below!");
            System.out.println("------Ticket Invoice------");
            System.out.println("Ticket Number: "+ticketID);
            System.out.println("Room ID: "+roomID);
            System.out.println("Seat Row: "+selectedRow);
            System.out.println("Seat Column: "+selectedCol);
            System.out.println("Contact Number: "+contactNo);
            System.out.println("--------------------------");
        //} else {
//            System.out.println("The seat you have chosen is unavailable, kindly choose again!");
//            ticketBooking();
//        }


    }
}
