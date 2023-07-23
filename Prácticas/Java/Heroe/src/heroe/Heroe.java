
package heroe;

public class Heroe {
    public static void main(String[] args) {
        SuperMan s = new SuperMan();
        SuperBoy sb = new SuperBoy();
        SuperGirl sg = new SuperGirl();
        Persona Willy = new Persona();
        
        Willy.edad=19;
        System.out.println("La edad de Willy es = " + Willy.edad);
        Willy.crecer();
        System.out.println("La edad de Willy un año despues = " + Willy.edad);
        
        s.Kryptonite=10;
        System.out.println("¿Superman está vivo? = " +s.its_alive());
        sg.energiaSolar=60;
        sg.edad=16;
        System.out.println("¿Super Girl tiene Alas de Fuego? = " + sg.obtieneAlasDeFuego());
        
    /*  sb.AlientoGelido=9;
        sb.edad=20;
        sb.Kryptonite=15;
        sb.crecer();
        sb.its_alive(); */
        
        
    }
    
}
