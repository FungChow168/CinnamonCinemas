package com.techReturner;

public class CinnamonCinema {
    private String[][] seatPlan = {{"A1","A2","A3","A4","A5"},
                                    {"B1","B2","B3","B4","B5"},
                                    {"C1","C2","C3","C4","C5"}};


    public String getSeatPlan() {
        String seats = "\n";

        for (String[] seatList : seatPlan){
            for (String seat : seatList)
                seats += seat + " ";
            seats += "\n";
        }
        System.out.println(seats);
        return seats;
    }

    public int getRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public String hasEnoughTickets(int noOfTicket){
        int row = 0;
        int col = 0;
        String result = col +" " + row;
        outerloop:
        for(int i=0; i<seatPlan.length; i++){
            for(int j =0; j< seatPlan[0].length; j++){
                if (!seatPlan[i][j].equals("XX")){
                    row = i;
                    col = j;
                    break outerloop;
                }
            }

        }
        if (row == seatPlan.length -1 && (col + noOfTicket)>seatPlan[0].length)
            result = "Do not have enough ticket.";
        return result;
    }

    public String purchaseTickets(int numberOfTickets){
        String tickets = "";

        return tickets;
    }

}
