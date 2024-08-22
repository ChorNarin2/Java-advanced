package resolvecofig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MainApplication.class, args);

        // Fetch the OrderClient bean to ensure it's available
        OrderClient orderClient = context.getBean(OrderClient.class);
        System.out.println("OrderClient Bean: " + orderClient);
    }
}
