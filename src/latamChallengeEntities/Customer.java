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
public class Customer extends Person {
    /*
    2. De sus clientes, la información que le interesa saber es : rut, el nombre y la fecha de nacimiento.
    
    */
    private String[] boughtTickets;

    public Customer() {
    }

    //  this is CRAZY INTERESTING ********************************************** !!!!!!!!!!!!!!!!!!
    public Customer(Person p) {
      super(p.getFirstName(), p.getMiddleName(), p.getLastName(), p.getRut(), p.getBirthDate());  
    }

    
    
    public Customer(String[] boughtTickets) {
        this.boughtTickets = boughtTickets;
    }

    public Customer(String[] boughtTickets, String firstName, String middleName, String lastName, int rut, LocalDate birthDate) {
        super(firstName, middleName, lastName, rut, birthDate);
        this.boughtTickets = boughtTickets;
    }
    
    
    
}
