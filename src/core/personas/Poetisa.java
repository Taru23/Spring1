package core.personas;

import core.Interfaces.Poema;

/**
 * Created by Jesús on 16/12/2015.
 */
public class Poetisa extends Juggler {
    private Poema poema;
    public Poetisa(Poema poema){
        this.poema = poema;
    }
    public Poetisa(int beanBags, Poema poema){
        super(beanBags);
        this.poema = poema;
    }
    public void perform() throws Exception{
        super.perform();
        System.out.println("Recitando...");
        poema.recitar();
    }

}
