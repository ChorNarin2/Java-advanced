package narin.com.shool_mgt;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.Resource;

@Component
// @Scope(value = )
public class OrderClient {

    @Resource
    private OrderService orderService;

    public void displayOrder() {
        System.out.println(orderService.Order());
    }
}