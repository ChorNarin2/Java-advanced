package resolvecofig;

import org.springframework.stereotype.Service;

@Service("serviceA")
public class OrderClient {

    public String Order() {
        return "Order details from OrderService";
    }
}
