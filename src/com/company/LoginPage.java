package com.company;

import java.util.Scanner;

public class LoginPage {

    public void loginCredential() {

        System.out.println("----------------------------");
        System.out.println("Welcome to JPM Shows Booking System!");
        System.out.println("----------------------------");

        System.out.println("Login as (Admin / Buyer) ?");
        Scanner in = new Scanner(System.in);
        String users = in.nextLine();

        if(users.equalsIgnoreCase("Admin")) {
            BookingShowAdmin admin = new BookingShowAdmin();
            admin.adminOptions();
        } else if(users.equalsIgnoreCase("Buyer")) {
            BookingShowBuyer buyer = new BookingShowBuyer();
            buyer.buyerOptions();
        } else {
            System.out.println("Invalid Login Credential!");
        }
    }
}
