package com.company;

import java.util.ArrayList;

public class ShowRoom {
    int col;
    int row;
    private int showRoomID;
    private char[][] showRoom;
    char seatAvailable = 'x';

    public ShowRoom(int showRoomID) {
        this.showRoomID = showRoomID;
        showRoom = new char[row][col];
    }
    void showRoomSetup(int room, int row, int col) {
        System.out.println("-------------------------------------------------");
        System.out.println("Room ID: "+room);
        System.out.println("Seats Layout: ");
        for(int i=0; i<row; i++) {
            System.out.print(i+1+" ");
            for(int j=0; j<col; j++) {
                System.out.print(seatAvailable+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
    }

}
