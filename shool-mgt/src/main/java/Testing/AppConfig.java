package Testing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

    @Bean
    @Lazy
    public MyService myService() {
        return new MyService();
    }

    @Bean
    public MyComponent myComponent() {
        return new  MyComponent();
    }
}
