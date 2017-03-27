
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marisol
 */
public class OrdenarComunidadDensidad implements Comparator<ComunidadAutonoma>{

    @Override
    public int compare(ComunidadAutonoma o1, ComunidadAutonoma o2) {
        return (int) (o1.obtenerDensidad()-o2.obtenerDensidad());
    }
    
}
