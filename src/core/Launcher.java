package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jesús on 16/12/2015.
 */
public class Launcher {

    public static void main( String args[] ){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-config.xml");
        Performer performer = (Performer) ctx.getBean("Espronceda");
        try {
            performer.perform();
        } catch (Exception e) {
            System.out.println("Ha saltado PerformanceException");

        }
    }
}
