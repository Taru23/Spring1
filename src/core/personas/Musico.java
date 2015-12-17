package core.personas;

import core.Interfaces.Instrumento;
import core.Interfaces.Performer;

/**
 * Created by Jesús on 17/12/2015.
 */
public class Musico implements Performer {
    public void setCancion(String cancion) { // se inyecta la cancion
        this.cancion = cancion;
    }

    public void setInstrumento(Instrumento instrumento) { // se inyecta el instrumento
        this.instrumento = instrumento;
    }

    private String cancion;
    private Instrumento instrumento;
    public void perform() throws Exception {
        System.out.println("Voy a tocar la cancion  llamada " + cancion);
        instrumento.sonar();
    }

}
