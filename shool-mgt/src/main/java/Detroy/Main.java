package Detroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Beancofig.class);

        Student student = context.getBean(Student.class);
        student.displayColors();
        student.Mysubjects();
    }

    void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Beancofig.class);

        Student student = context.getBean(Student.class);
        // student.display();
    }
}
