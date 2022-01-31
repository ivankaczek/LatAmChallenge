/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latamChallengeEntities;

import java.time.LocalDate;
import latamChallengeServices.SalesServices;

/**
 *
 * @author Ivan
 */
public class SalesExecutive extends Person {
    /*
    2. De sus clientes, la información que le interesa saber es : rut, el nombre y la fecha de nacimiento.
    3. De sus vendedores necesita los mismos datos que del cliente más la cantidad de entradas vendidas
    */
    
    private String[] listSoldTickets;
    private int[] correspCommisions; 
    private String salesExCode;

    
    // we have to work with this if we watn to CONSTRUCT A SALES EXCECUTIVE WITH A PREVIOUS PERSON DATA
    public SalesExecutive(Person p) {
        super(p.getFirstName(),p.getMiddleName(),p.getLastName(),p.getRut(), p.getBirthDate());
    }

    public SalesExecutive(String firstName, String middleName, String lastName, int rut, LocalDate birthDate) {
        super(firstName, middleName, lastName, rut, birthDate);
    }

    
    public SalesExecutive(String[] listSoldTickets, int[] correspCommisions) {
        this.listSoldTickets = listSoldTickets;
        this.correspCommisions = correspCommisions;
    }

    SalesServices slSvc = new SalesServices();
    
    public void setSalesExCode(String salesExCode) {
        this.salesExCode = salesExCode;
    }

    
    public String getSalesExCode() {
        return salesExCode;
    }
    
    
    
}
