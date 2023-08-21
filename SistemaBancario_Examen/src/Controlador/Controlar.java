
package Controlador;

import Administracion.Admin_Tickets;
import Administracion.ListaTicket.AdministrarTicket;

/**
 *
 * @author Daniel Hidalgo
 */
public class Controlar {
   private Admin_Tickets listaTicketes;

    public Controlar() {
    }
   

   public Controlar(Admin_Tickets listaTicketes) {
        this.listaTicketes = listaTicketes;
  }
   
   public void generarTicket(String tipo) {
      int numero = 0;

      
      for (Admin_Tickets listaTicketes : this.listaTicketes.getListaTickets) {
          if (listaTicketes.getTipo().equals(tipo)) {
            numero = listaTicketes.getNumero() + 1;
            break;
         }
      }
   }
}



