package narin.com.shool_mgt;

import org.springframework.stereotype.Service;

@Service("serviceA")
public class OrderServiceA implements OrderService{

    @Override
    public String Order() {
        return "Order Service A";
    }
    
}
