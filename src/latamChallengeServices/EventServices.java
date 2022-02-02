/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latamChallengeServices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import latamChallengeEntities.Event;
import latamChallengeEntities.EventDataBase;

/**
 *
 * @author Ivan
 */
public class EventServices {
    
    private Scanner sc;
    private List<String> eventCodes;
    private List<Event> eventObjList;
                                                            // ATTENTION TO THIS!!!!
                                                            // When we create any object EventServices we inmediately also create 
                                                            // a new ArrayList to store the codes 
                                                            // and also a Scanner with the delimiter "\n"
    public EventServices() {
        this.eventCodes = new ArrayList();
        this.eventObjList = new ArrayList();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }
    
    
    
    
    // to CREATE and event
    public Event createEvent(){
        System.out.println(" ");
        System.out.println("NEW EVENT TO BE CREATED");
        System.out.println("Please write the name for this Event"); 
        String auxEventName = sc.next();                        // WARNING WARNING WARGNING !!!!!!!!!! 
                                                                // Use here "next" with delimiter("\n") in the Scanner
        System.out.println("Which is the minimum age to attend this event?");
        int auxMinAge = sc.nextInt();
        System.out.println("Please inform the amount of tickets available for this event");
        int auxAmount = sc.nextInt();
        System.out.println("Year: ");
        int auxYear = sc.nextInt();
        System.out.println("Month (in number):");
        int auxMonth = sc.nextInt();
        System.out.println("Day:");
        int auxDay = sc.nextInt();
        LocalDate auxLocalDate = LocalDate.of(auxYear, auxMonth, auxDay);
        
        return new Event(auxEventName, auxMinAge, auxAmount, auxLocalDate);
    }    
    
    public void createAndStoreEvent(){
        Event auxEv = createEvent();
        auxEv.setAvailable(true);
        String auxEvCode = generateEventCode(auxEv);
        auxEv.setEventCode(auxEvCode);
        eventCodes.add(auxEvCode);
        //System.out.println("The size of the ArrayList with the event codes is " + eventCodes.size());
        eventObjList.add(auxEv);
        System.out.println("");
       
    }
    
    public void showEventList() {
        System.out.println("");
        System.out.println("LIST OF AVAILABLE EVENTS");
        for (Event var : eventObjList) {
            System.out.println(var.toString());
        }
    }
    
       
    public void eventInfo(Event e){
        System.out.println("EVENT INFORMATION");
        System.out.println("Event name: " + e.getEventName() );
        if (e.getMinAge()==0) {
            System.out.println("Minimum age: no age restriction");
        } else {
            System.out.println("Minimum age: " + e.getMinAge() + " years");
        }
             
        System.out.println("Amount of tickets available: " + e.getAmount());
        e.setAvailable(true);
        //System.out.println("Event Code: " + generateEventCode(e));
        System.out.println("");
        
    }
    
    public String generateEventCode(Event e){
        String thisCode;
        String a = e.getEventName().substring(0, 4);
        DateTimeFormatter f = DateTimeFormatter.BASIC_ISO_DATE;
        String b = e.getEvDate().format(f);
        thisCode = a.concat(b);
        return thisCode;
    }   
    
    public void showAvailableEvents(EventDataBase e){
        System.out.println("");
        System.out.println("LIST OF AVAILABLE EVENTS");
        
        for (int i = 0; i < 10; i++) {
            if (e.getEventDataBase()[i]!=null) {
                System.out.print("#"+(i+1)+" ");
                System.out.print(e.getEventDataBase()[i]);  
            }
            System.out.println("");
            
        }
        System.out.println(" ");
    }
    
    
    
}
