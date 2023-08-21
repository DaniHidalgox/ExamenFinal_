
package Administracion.ListaTicket;


/**
 *
 * @author Daniel Hidalgo
 */
//  numero = adminTicker.getNumero() + 1;
       //     break;
import Administracion.Admin_Tickets;
import java.util.ArrayList;

public class AdministrarTicket {
   private ArrayList<Admin_Tickets> listaTicketes;

    public AdministrarTicket(ArrayList<Admin_Tickets> listaTickets) {
        this.listaTicketes = listaTickets;
    }


   public void agregarTicket(Admin_Tickets ticket) {
      this.listaTicketes.add(ticket);
   }

 public void eliminarTicket(Admin_Tickets tickets){
     this.listaTicketes.remove(tickets);
 }
 
 public void eliminarTicket(int posicion){
     this.listaTicketes.remove(posicion);
    
 }
}
