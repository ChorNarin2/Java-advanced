package Detroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Component
// @Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class Student implements InitializingBean {

    @Autowired
    private String[] favoriteColors;

    @Autowired
    private List<Subject> mysubjects;


    public void Mysubjects(){
        System.out.println(mysubjects);
    }

    @Autowired
    private Subject subject;



    public void displayColors() {
        System.out.println(Arrays.toString(favoriteColors));
    }

    // @PostConstruct
    public void setup() {
        System.out.println("After setting up");
    }

    // @PreDestroy
    public void destroy() {
        System.out.println("Before destroying");
    }

    public void display() {
        subject.setSubject(null);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Initializing bean");
    }
}
