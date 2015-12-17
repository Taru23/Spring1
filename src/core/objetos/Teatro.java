package core.objetos;

/**
 * Created by Jesús on 17/12/2015.
 */
public class Teatro {
    public Teatro(){

    }

    public void encenderFocos(){
            System.out.println("Se estan encendiendo los focos...");

    }
    public void apagarFocos() {
        try {
            System.out.println("Se estan apagando los focos...");
        } catch (NullPointerException excepcion){
            System.out.println("El objeto ya tiene un valor nulo");
        }
    }
}
