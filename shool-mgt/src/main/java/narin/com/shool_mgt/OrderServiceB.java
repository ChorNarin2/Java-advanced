package narin.com.shool_mgt;

import org.springframework.stereotype.Service;

@Service("serviceB")
public class OrderServiceB implements OrderService 
{

    @Override
    public String Order() {

        return "Ordering Service B";
    }
    
    
}
