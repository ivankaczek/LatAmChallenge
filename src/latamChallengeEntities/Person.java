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
public class Person {
    /*
    2. De sus clientes, la información que le interesa saber es : rut, el nombre y la fecha de nacimiento.
    3. De sus vendedores necesita los mismos datos que del cliente más la cantidad de entradas vendidas
    */
    private String firstName;
    private String middleName;
    private String lastName;
    private int rut;
    private LocalDate birthDate;

    public Person() {
    }

    public Person(String firstName, String middleName, String lastName, int rut, LocalDate birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.rut = rut;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRut() {
        return rut;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", rut=" + rut + ", birthDate=" + birthDate + '}';
    }
    
    
    
    
    
    
}
