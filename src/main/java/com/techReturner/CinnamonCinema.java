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

    public String purchaseTickets(int numberOfTickets){
        String tickets = "";

        return tickets;
    }

}
