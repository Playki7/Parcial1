
package Modelo;

import java.util.Scanner;


public class Banco {
   Scanner teclado = new Scanner(System.in); 
   private String nombre;

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
