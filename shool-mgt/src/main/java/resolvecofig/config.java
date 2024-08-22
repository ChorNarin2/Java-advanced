package resolvecofig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

   
    @Bean
    public OrderClient orderClient() {
        return new OrderClient();
    }

    
}
