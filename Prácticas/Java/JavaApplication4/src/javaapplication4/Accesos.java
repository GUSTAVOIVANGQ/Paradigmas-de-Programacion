package javaapplication4;

import OtroPaquete.Aguila;
import OtroPaquete.Volador;

public class Accesos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aguila vengador = new Aguila();
        vengador.velocidad=177;
        System.out.println("velocidad = " + vengador.velocidad);
        System.out.println("velociadad ="+ vengador.toString().substring(0, 2));
        vengador.volar();
        System.out.println("La velocidad del aguila = " + vengador.velocidad);
        vengador.aterrizar();
        System.out.println("La velocidad del aguila = " + vengador.velocidad);
        
    }
    
}
