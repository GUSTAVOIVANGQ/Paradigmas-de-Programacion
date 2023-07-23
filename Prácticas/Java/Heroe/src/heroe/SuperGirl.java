/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroe;

/**
 *
 * @author escom
 */
public class SuperGirl extends SuperMan{
    int energiaSolar;
    
    boolean obtieneAlasDeFuego(){
        if(energiaSolar > 50 && edad > 15){
            System.out.println("Obtiene Alas de Fuego");
        }
        else{
            System.out.println("No obtiene Alas de Fuego");
        }
    return (energiaSolar > 50 && edad > 15); 
    }
    
}
