
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class ordenarDensidad implements Comparator<Provincia>{

    @Override
    public int compare(Provincia t, Provincia t1) {
        return (int) (t.obtenerDensidad()-t1.obtenerDensidad());
    }
    
}
