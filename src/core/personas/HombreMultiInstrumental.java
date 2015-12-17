package core.personas;

import core.Interfaces.Instrumento;
import core.Interfaces.Performer;

import java.util.Collection;

/**
 * Created by Jesús on 17/12/2015.
 */
public class HombreMultiInstrumental implements Performer {

    private Collection<Instrumento> intrumentosDisponibles;

    public HombreMultiInstrumental() {
    }

    public void perform() throws Exception {
        for( Instrumento instrumento: intrumentosDisponibles){
            instrumento.sonar();
        }
    }
    public void setIntrumentosDisponibles(Collection<Instrumento> intrumentosDisponibles) {
        this.intrumentosDisponibles = intrumentosDisponibles;
    }

}
