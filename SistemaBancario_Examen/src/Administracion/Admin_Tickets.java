/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administracion;

/**
 *
 * @author Daniel Hidalgo
 */
public class Admin_Tickets {
    private int numero;
    private String Tipo;
    public Iterable<Admin_Tickets> getListaTickets;

    public Admin_Tickets(int numero, String tipo) {
        this.numero = numero;
        this.Tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

   
   
   public String toString() {
      return "Ticket " + this.numero+"del tipo"+this.Tipo;
   }

}

    

