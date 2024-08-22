package resolvecofig;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service("serviceB")
public class OrderServiceB implements OrderService {

    @Override
    public String Order() {

        return "Order Service B";
    }
    
}
