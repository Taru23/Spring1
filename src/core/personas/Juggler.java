package core.personas;

import core.Interfaces.Performer;
import core.Interfaces.Poema;

/**
 * Created by Jesús on 16/12/2015.
 */


public class Juggler implements Performer {
    private int beanBags;
    private Poema poema;
    public Juggler(){
        beanBags = 3;
    }
    public Juggler( int beanBags ){
        this.beanBags = beanBags;
    }


    public void perform() throws Exception {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
