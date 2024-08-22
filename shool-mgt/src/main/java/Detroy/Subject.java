package Detroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Subject implements InitializingBean {

    private String title;
    private String name;

    // Uncomment if needed
    // private List<String> subjects;

    public Subject() {
        // Default constructor
    }

    public Subject(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("Subject initialized");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Subject cleanup");
    }

    public void setSubject(String name) {
        this.name = name;
        System.out.println("Setting Subject: " + name);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Subject afterPropertiesSet");
    }

    // Getters and setters for title and name (optional)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
