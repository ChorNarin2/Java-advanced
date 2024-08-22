package Testing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    
    @Autowired
    private final MyService myService;

    public MyComponent(MyService myService) {
        this.myService = myService;
    }

    public void execute() {
        myService.performService();
    }

    public void  getMyService() {

        System.out.println("what the fuck ");
    }
}
