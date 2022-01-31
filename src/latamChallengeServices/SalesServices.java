/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latamChallengeServices;

import latamChallengeEntities.Customer;
import latamChallengeEntities.SalesExecutive;

/**
 *
 * @author Ivan
 */
public class SalesServices {
    
   public String generateSalesExCode(SalesExecutive s){
       String aux1 = s.getFirstName().substring(0, 3).toUpperCase();
       String aux2 = s.getLastName().substring(0, 3).toUpperCase();
       String aux3 = Integer.toString(s.getRut()).substring(0, 4);
       return "SE".concat(aux3.concat(aux1.concat(aux2)));
   }
    
   public String generateCustomerCode(Customer c ){
       String a = c.getFirstName().substring(0, 3).toUpperCase();
       String b = c.getLastName().substring(0, 3).toUpperCase();
       int aux = c.getRut();
       String cc = Integer.toString(aux);
       return a.concat(b).concat(cc);
   } 
   
}
