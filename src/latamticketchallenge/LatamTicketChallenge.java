/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latamticketchallenge;

import java.time.LocalDate;
import latamChallengeEntities.Customer;
import latamChallengeEntities.Event;
import latamChallengeEntities.EventDataBase;
import latamChallengeEntities.Person;
import latamChallengeEntities.SalesExecutive;
import latamChallengeEntities.Ticket;
import latamChallengeServices.EventServices;
import latamChallengeServices.SalesServices;
import latamChallengeServices.TicketServices;

/**
 *
 * @author Ivan
 */
public class LatamTicketChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Desafío - Ticketera "Teckit"
Un cliente te ha elegido para desarrollar un software que le permita registrar las entradas vendidas y
utilizadas de los eventos con los que trabaja una ticketera.
El cliente desea que se pueda hacer seguimiento de:
1. La información que necesita saber de los eventos es: 
                nombre, 
                edad mínima de ingreso 
                una lista de entradas.  En el caso de las entradas, existen de dos tiṕos:
                    Entradas normales; tienen a) precio b) numero de asiento c) un cliente d) un vendedor;
                    Entradas VIP: igual que las entradas normales , pero además tienen derecho a retirar un regalo en el evento.
2. De sus clientes, la información que le interesa saber es : rut, el nombre y la fecha de nacimiento.
3. De sus vendedores necesita los mismos datos que del cliente más la cantidad de entradas vendidas
Además el cliente menciona que:
    Los eventos se reservan el derecho de admisión según la edad del cliente.
    Las entradas solo pueden ser usadas una vez y solo por el cliente asociado al rut.
    Se debe llevar la cuenta de las entradas usadas y de las vendidas para cada evento.
Para desarrollar esto, debes instanciar las clases necesarias para generar un escenario que
demuestre que es posible realizar lo solicitado.
Ejemplo:
Crear un evento, crear varios clientes y un vendedor e imprimir por consola cada cosa que pase, por
ejemplo, se vendió una entrada para un cliente posteriormente se utilizó una entrada para ingresar a
un evento por ese cliente. Donde el output podría ser algo asi:
Caso: Crear evento:
Caso: Venta de entrada:
Caso: Ingreso al evento con una entrada, consultada por el rut del cliente Cuando el evento no está
en curso:
Cuando el evento está en curso y el cliente puede pasar:
Cuando el evento está en curso pero la entrada ya se usó
Cambio de estado del evento (En curso o no en curso)
Cuando se muestra la cantidad de entradas vendidas por un vendedor:
Creando evento <NombreEvento> (Edad minima: <edadMinima>)
Vendiendo entrada a cliente <NombreCliente> (<RutCliente>) para evento
<NombreEvento>
Usando entrada con cliente <NombreCliente> (<RutCliente>) para evento
<NombreEvento>
No se puede usar la entrada porque el evento <NombreEvento> no está en curso.
Usando entrada con cliente <NombreCliente> (<RutCliente>) para evento
<NombreEvento>
Entrada encontrada, <NombreCliente> puede pasar.
Usando entrada con cliente Alex Tapia (19.000.019-4) para evento Fiesta
Entrada para rut 19.000.019-4 ya fue usada, no puede pasar.
El evento <NombreEvento> se ha cambiado: <EnCurso>.
El vendedor <NombreVendedor> ha vendido:
<CantidadEntradaNormal> entrada/s normal/es
<CantidadEntradaVip> entrada/s VIP
        ****************************************************    
        REQUERIMIENTO
Clase Entrada con atributos
Clase Entrada VIP con atributos
Clase Cliente con atributos
Clase Vendedor con atributos
Clase Evento con atributos
Herencia con Persona (o alguna similar) como SuperClase de cliente y vendedor
Herencia de Entrada VIP como subclase de Entrada
Encapsulamiento de clase Entrada
Encapsulamiento de clase Cliente
Encapsulamiento de clase Vendedor
Encapsulamiento de clase Evento
Encapsulamiento de clase Entrada VIP
Derecho de admision a eventos según edad de la persona
Calcular edad de la persona en base a la fecha de nacimiento
Calcular edad de la persona en base a la fecha de nacimiento con un método
Prevenir venta de entrada si el cliente tiene una edad incorrecta
Prevenir que una entrada se use más de una vez
Mantener la cantidad de entradas vendidas por los vendedores */
        
SalesServices slSvc = new SalesServices();
TicketServices tk = new TicketServices();
EventServices evSvc = new EventServices();
EventDataBase dB = new EventDataBase();         // OPTION 1: I don't know how to handle it yet
String dataBase[] = new String[10];             // OPTION 2: It is the best at the moment


        //Event ev01 = evSvc.createEvent();
        //evSvc.eventInfo(ev01);
Event ev02 = new Event("Andreas Steier Harpsichord Concerto", 0, 500);
ev02.setEvDate(LocalDate.of(2022, 3, 28));
dataBase[0]=ev02.getEventName();
dB.setEventDataBase(dataBase);
evSvc.eventInfo(ev02);
//System.out.println(" ");

Event ev03 = new Event("Moulin Rouge Cabaret", 18, 200);
ev03.setEvDate(LocalDate.of(2022, 4, 11));
dataBase[1]=ev03.getEventName();
dB.setEventDataBase(dataBase);
evSvc.eventInfo(ev03);

Event ev04 = new Event("Marta Argerich Tour", 14, 350);
ev04.setEvDate(LocalDate.of(2022, 5, 25));
dataBase[2]=ev04.getEventName();
dB.setEventDataBase(dataBase);
evSvc.eventInfo(ev04);

Event ev05 = new Event("Cirque du Soleil", 0, 400);
ev05.setEvDate(LocalDate.of(2022, 7, 11));
dataBase[3] = ev05.getEventName();
dB.setEventDataBase(dataBase);
evSvc.eventInfo(ev05);
        
// Ivan is now a PERSON
Person p01 = new Person("Ivan", "Alejandro", "Tkaczek", 31037338, LocalDate.of(1985, 1, 24));
//System.out.println(p01);
// Ivan becomes a Sales Executive

//SalesExecutive se01 = new SalesExecutive("Ivan", "Alejandro", "Tkaczek", 31037338, LocalDate.of(1985, 01,24));
//se01 = (SalesExecutive)p01;
SalesExecutive se01 = new SalesExecutive(p01);
//System.out.println(se01);                         // this shows the conversion imports the attributes from person
String se01Code = slSvc.generateSalesExCode(se01);
se01.setSalesExCode(se01Code);
//System.out.println("The salesExecutive code is " + slSvc.generateSalesExCode(se01));
//System.out.println("The same code can be called like this " + se01.getSalesExCode());

// Wolfi is now a PERSON
Person p02 = new Person("Wolfi", " ", "Kaczek", 111111112, LocalDate.of(2020, 4, 4));
//System.out.println(p02);
// Wolfi becomes a CUSTOMER
Customer c01 = new Customer(p02);
//System.out.println("customer code: " + slSvc.generateCustomerCode(c01));

// Here we simulate that Ivan sells a Ticket to Wolfi
Ticket t01=new Ticket(ev05, c01, se01);
tk.printTicket(t01);


evSvc.showAvailableEvents(dB);

// Wolfi compra una entrada para el concierto de Andreas Steier
// 1° Wolfi tiene que ser un cliente, 
// 2° wolfi buys his tickets from a sales executive
// Se me ocurre que cuando una persona compra la entrada, queda anotado su nombre o su código en la lista de attendants
        
    }
    
}
