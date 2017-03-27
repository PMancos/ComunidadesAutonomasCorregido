
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
public class ordenarAlfabeticamente implements Comparator<Provincia>{

    @Override
    public int compare(Provincia o1, Provincia o2) {
        return o1.getNomProv().compareToIgnoreCase(o2.getNomProv());
    }

    
}
