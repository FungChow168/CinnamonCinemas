package com.techReturner;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCinnamonCinemas {

    CinnamonCinema ca  = new CinnamonCinema();

    @Test
    public void checkSeatPlan() {
        //print the seat plan
        assertEquals("\nA1 A2 A3 A4 A5 \nB1 B2 B3 B4 B5 \nC1 C2 C3 C4 C5 \n", ca.getSeatPlan());
    }

    @Test
    public void checkRandomOneToThree() {
        assertTrue("should between 1 to 3.", ca.getRandomNumber(1, 3) < 4 && ca.getRandomNumber(1, 3) > 0);
    }

    @Test
    public void checkHasEnoughAvailableTickets(){
        assertEquals("0 0", ca.hasEnoughTickets(3));
    }

    @Test
    public void checkAllocateSeat(){
        assertEquals("A1 A2 A3 ", ca.allocateSeat(3));
        assertEquals("A4 A5 B1 ", ca.allocateSeat(3));
        assertEquals("B2 B3 B4 ", ca.allocateSeat(3));
        assertEquals("B5 C1 ", ca.allocateSeat(2));
        assertEquals("C2 C3 C4 ", ca.allocateSeat(3));
        assertEquals("Sorry, insufficient tickets.", ca.allocateSeat(3));
    }


}
