package core.objetos;

/**
 * Created by Jesús on 17/12/2015.
 */
public class Stage {
    private Stage(){ // constructor privado -> ver singleton model.

        //System.out.println("Se ha creado el objeto de la clase Stage");
    }
    private static class StageSingletonHolder{
        static Stage instancia = new Stage();
    }
    private static Stage getInstance(){
        // este metodo se ejecuta gracias al XML de configuracion que usa como factory-method este metodo, getInstace
        return StageSingletonHolder.instancia;
    }
}
