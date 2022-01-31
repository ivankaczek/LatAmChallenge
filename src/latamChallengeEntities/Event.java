/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latamChallengeEntities;

import java.time.LocalDate;

/**
 *
 * @author Ivan
 */
public class Event {
    /*
        Los eventos se reservan el derecho de admisión según la edad del cliente.
                nombre, 
                edad mínima de ingreso 
                una lista de entradas.  En el caso de las entradas, existen de dos tiṕos:
                    Entradas normales; tienen a) precio b) numero de asiento c) un cliente d) un vendedor;
                    Entradas VIP: igual que las entradas normales , pero además tienen derecho a retirar un regalo en el evento.
    
    */
    
    private String eventName;
    private String eventCode;
    private int minAge;
    private String[] listRegTickets;
    private String[] listVIPtikcets;
    private String gift;
    private int amount;
    private boolean available;
    public LocalDate getEvDate() {
        return evDate;
    }

    public void setEvDate(LocalDate evDate) {
        this.evDate = evDate;
    }
    private LocalDate evDate;
    

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Event() {
    }

    // constructor with Basic Information to stard
    public Event(String eventName, int minAge, int amount) {
        this.eventName = eventName;
        this.minAge = minAge;
        this.amount = amount;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventCode() {
        return eventCode;
    }

    public int getMinAge() {
        return minAge;
    }

    public String[] getListRegTickets() {
        return listRegTickets;
    }

    public String[] getListVIPtikcets() {
        return listVIPtikcets;
    }

    public String getGift() {
        return gift;
    }

    public int getAmount() {
        return amount;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public void setListRegTickets(String[] listRegTickets) {
        this.listRegTickets = listRegTickets;
    }

    public void setListVIPtikcets(String[] listVIPtikcets) {
        this.listVIPtikcets = listVIPtikcets;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

   
    
    
}
