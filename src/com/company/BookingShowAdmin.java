package com.company;

import java.util.*;

public class BookingShowAdmin {
    private int roomID;
    private int srRow;
    private int srCol;
    private int[][] room;
    HashMap<Integer, int[][]> roomDetails = new HashMap<>();
    Scanner in = new Scanner(System.in);
    char toContinue;

    public void adminOptions() {
        System.out.println("Choose an option from the menu ");
        System.out.println("1.Setup\n2.View Booking\n3.Login as different credential");
        int adminInput = in.nextInt();
        if(adminInput == 1) {
            showRoomSetUp();
        } else if(adminInput == 2) {
            viewShowRoom();
        } else if(adminInput == 3) {
            LoginPage loginPage = new LoginPage();
            loginPage.loginCredential();
        }

    }
    void showRoomSetUp() {
        System.out.println("Select Show Room");
        roomID = in.nextInt();
        System.out.println("Insert Number of Rows");
        srRow = in.nextInt();
        System.out.println("Insert Number of seats per Rows");
        srCol = in.nextInt();
        room = new int[srRow][srCol];
        roomDetails.put(roomID, room);

        if(srRow <= 10 && srCol <= 26) {
            ShowRoom showRoom = new ShowRoom(roomID);
            showRoom.showRoomSetup(roomID, srRow, srCol);
            System.out.println("Do you wish to continue (Y / N): ");
            toContinue = in.next().charAt(0);
            if(toContinue == 'y' || toContinue == 'Y') {
                adminOptions();
            } else if(toContinue == 'n' || toContinue == 'N'){
                System.out.println("Thanks for visiting, see you again!");
            } else {
                System.out.println("Invalid Input!");
            }
        } else {
            System.out.println("Max seats per row is 10 and max rows are 26! Kindly select again: ");
            showRoomSetUp();
        }
    }

    public List viewShowRoom() {
        System.out.println(Arrays.asList(roomDetails));

        System.out.println("Do you wish to continue (Y / N): ");
        toContinue = in.next().charAt(0);
        if(toContinue == 'y' || toContinue == 'Y') {
            adminOptions();
        } else {
            System.out.println("Thanks for visiting, see you again!");
        }
        return Arrays.asList(roomDetails);
    }

    boolean checkShowAvailability(int roomID, int column, int row) {
        if(!roomDetails.containsKey(roomID)) {
            System.out.println("No show found, enter new show ID!");
            BookingShowBuyer buyer = new BookingShowBuyer();
            buyer.ticketBooking();
        } else {
            int[][] selectedSeat = roomDetails.get(roomID);
            for(int i = 0; i < selectedSeat.length; i++) {
                for(int j = 0; j <selectedSeat.length; j++) {
                    if(selectedSeat[row][column] == 'x') {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
