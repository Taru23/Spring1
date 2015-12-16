package core.poemas;

import core.Poema;

/**
 * Created by Jesús on 16/12/2015.
 */
public class CancionDelPirata implements Poema {
    private final String cancion[] = {
            "Con diez canhones por banda",
            "viento en popa, a toda vela",
            "no corta el mar, sino vuela",
            "un velero bergantin",
            "Bajel pirata que llaman",
            "por su bravura, El Temido",
            "en todo mar conocido",
            "del uno al otro confin"
    };
    public CancionDelPirata(){
        // constructor por defecto
    }
    public void recitar() {
        for ( int i = 0; i < cancion.length; i++ ){
            System.out.println( cancion[ i ] );
        }
    }
}
