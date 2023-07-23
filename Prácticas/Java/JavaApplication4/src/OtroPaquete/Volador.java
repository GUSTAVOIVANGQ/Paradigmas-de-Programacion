package OtroPaquete;

/**
 *
 * @author escom
 */
public class Volador {
    public short velocidad;
    
    public short volar(){
    short aceleracion;
    aceleracion = (short) (2*velocidad);
    return aceleracion;
}
    public void aterrizar(){
        velocidad=0;
    }
}
