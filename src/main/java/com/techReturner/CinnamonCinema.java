package com.techReturner;

public class CinnamonCinema {
    private String[][] seatPlan = {{"A1","A2","A3","A4","A5"},
                                    {"B1","B2","B3","B4","B5"},
                                    {"C1","C2","C3","C4","C5"}};
    private final String NOSEAT = "Sorry, insufficient tickets.";
    private final String SEATTAKEN = "XX";

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
        String result = row +" " + col;
        outerloop:
        for(int i=0; i<seatPlan.length; i++){
            for(int j =0; j< seatPlan[0].length; j++){
                if (!seatPlan[i][j].equals(SEATTAKEN)){
                    row = i;
                    col = j;
                    result = i + " " + j;
                    break outerloop;
                }
            }

        }
        if (row == seatPlan.length -1 && (col + noOfTicket)>seatPlan[0].length)
            result = NOSEAT;
        return result;
    }

    public String allocateSeat(int numberOfTickets){
        String seat = hasEnoughTickets(numberOfTickets);
        String result = "";

        if (!seat.equals(NOSEAT)){
            String [] location = seat.split(" ");
            int row = Integer.valueOf(location[0]);
            int col = Integer.valueOf(location[1]);
            for (int i = 0; i < numberOfTickets; i++){
                result += seatPlan[row][col] + " ";
                seatPlan[row][col] = SEATTAKEN;
                col += 1;
                if(col >= seatPlan[0].length ){
                    row += 1;
                    col = 0;
                }
            }
            System.out.println(result );
        }else {
            System.out.println(NOSEAT);
            result = NOSEAT;
        }
        return result;
    }

}
