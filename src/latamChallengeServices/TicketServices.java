/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latamChallengeServices;

import java.util.ArrayList;
import latamChallengeEntities.Customer;
import latamChallengeEntities.Event;
import latamChallengeEntities.SalesExecutive;
import latamChallengeEntities.Ticket;

/**
 *
 * @author Ivan
 */
public class TicketServices {
    
    public ArrayList<String> ticketCodes;

    
    /* The constructor will originally look like this, but we will initialize it in a different way
    */
    public TicketServices(ArrayList<String> ticketCodes) {
        this.ticketCodes = ticketCodes;
    }
    
    public TicketServices() {
        this.ticketCodes = new ArrayList();
    // The previous lines means that every time that we "call" the TicketServices, we will have a new ArrayList
    // that will be born
        
        
        
    
    /*
    public void checkAge(Event e, Customer c){
          
    }
    */
    
    
    
    }

    public void printTicket(Ticket t){
        System.out.println("*****************************************************");
        System.out.println(t.getE().getEventName().toUpperCase());
        System.out.println("*****************************************************");
        System.out.println("Valable for " + t.getC().getFirstName() + t.getC().getLastName());
        System.out.println("Valeble only on " + t.getE().getEvDate().toString());
        System.out.println("**        ***             **");
        System.out.println("Please print this ticket or show it" );
        System.out.println("it at the entrance with your SmartPhone");
        System.out.println("*****************************************************");
    }

}