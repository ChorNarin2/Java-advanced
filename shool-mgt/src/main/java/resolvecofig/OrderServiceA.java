package resolvecofig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



// @Component
// @Qualifier("serviceA")
@Service("serviceA")
public class OrderServiceA implements OrderService {

    @Override
    public String Order() {

        return "Order Service A";
    }
    
}
