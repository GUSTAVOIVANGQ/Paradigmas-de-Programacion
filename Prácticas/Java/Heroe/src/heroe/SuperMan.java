
package heroe;

public class SuperMan extends Persona{
    int Kryptonite;
    
    boolean its_alive(){
        if (Kryptonite>10){
            System.out.println("Está Muerto");
        } else {
            System.out.println("Está vivo");
        }
        return (Kryptonite<=10);
}
}
