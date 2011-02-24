package chapter05.exercise5_1;

public class TicketMaker {
    private int ticket = 1000;
    
    private static TicketMaker ticketMaker = new TicketMaker();
    public static TicketMaker getInstance() {
        return ticketMaker;
    }
    
    private TicketMaker() {
    }
    
    public int getNextTicketNumber() {
        return ticket++;
    }
}
