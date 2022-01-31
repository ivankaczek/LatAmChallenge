/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latamChallengeEntities;

/**
 *
 * @author Ivan
 */
public class Ticket {
    /*
    registrar las entradas vendidas y utilizadas de los eventos con los que trabaja una ticketera.
    Las entradas solo pueden ser usadas una vez y solo por el cliente asociado al rut.
    Se debe llevar la cuenta de las entradas usadas y de las vendidas para cada evento.
    IDEA #1: Es algo obvio, pero cada entrada ticket tiene un evento asociado... ¿cómo hacer eso?
    Ej: ya tengo como evento el concierto de Andreas Steier, y sé que son 500 entradas...
    IDEA #2: Understad that     a) There's a "printed" version of the ticket that the cliets shows while arriving
                                b) There's what more information stored in the system, that the clients does not necesary knows
                                    like the person who sold it, or amount of times he has bought tickets, etc...
    IDEA #3: To avoid storing a full "event object" in each ticket, every event should have a unique code to store only that
                                That code might help to "bring/call" other information if it is necessary (look for code attribute)
    */
    
   private Event e;
   private Customer c;
   private SalesExecutive s;
   private String ticketCode;

    public Event getE() {
        return e;
    }

    public Ticket(Event e, Customer c, SalesExecutive s) {
        this.e = e;
        this.c = c;
        this.s = s;
    }
    
    

    public void setE(Event e) {
        this.e = e;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public SalesExecutive getS() {
        return s;
    }

    public void setS(SalesExecutive s) {
        this.s = s;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    @Override
    public String toString() {
        return "Ticket{" + "e=" + e + ", c=" + c + ", s=" + s + ", ticketCode=" + ticketCode + '}';
    }
   
   
    
    
}
