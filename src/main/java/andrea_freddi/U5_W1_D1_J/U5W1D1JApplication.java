package andrea_freddi.U5_W1_D1_J;

import andrea_freddi.U5_W1_D1_J.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1JApplication {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D1JApplication.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1JApplication.class);

        Menu m = (Menu) ctx.getBean("menu");
        m.printMenu();

        ctx.close();

    }

}
