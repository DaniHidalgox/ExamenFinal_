
package Administracion.ListaTicket;


/**
 *
 * @author Daniel Hidalgo
 */
import java.util.ArrayList;
import sun.security.krb5.internal.Ticket;

public class AdministrarTicket {
   private ArrayList<Ticket> listaTickets;

    public AdministrarTicket(ArrayList<Ticket> listaTickets) {
        this.listaTickets = listaTickets;
    }


   public void agregarTicket(Ticket ticket) {
      this.listaTickets.add(ticket);
   }

 public void eliminarTicket(Ticket ticket){
     this.listaTickets.remove(ticket);
 }
 
 public void eliminarTicket(int posicion){
     this.listaTickets.remove(posicion);
 }
}
