/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latamChallengeServices;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import latamChallengeEntities.Event;
import latamChallengeEntities.EventDataBase;

/**
 *
 * @author Ivan
 */
public class EventServices {
    
    private Scanner sc = new Scanner(System.in);
    
    
    // to CREATE and event
    public Event createEvent(){
        System.out.println("NEW EVENT TO BE CREATED");
        System.out.println("Please write the name for this Event"); 
        String auxEventName = sc.nextLine();
        System.out.println("Which is the minimum age to attend this event?");
        int auxMinAge = sc.nextInt();
        System.out.println("Please inform the amount of tickets available for this event");
        int auxAmount = sc.nextInt();
        return new Event(auxEventName, auxMinAge, auxAmount);
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
