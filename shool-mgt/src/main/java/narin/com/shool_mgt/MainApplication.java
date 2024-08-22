package narin.com.shool_mgt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(MainApplication.class, args);

        // Fetch the OrderClient bean to ensure it's available
        OrderClient orderClient = context.getBean(OrderClient.class);
        orderClient.displayOrder();  // Should print: "Order details from OrderService"
    }
}