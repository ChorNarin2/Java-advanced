package Detroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Lazy;
import java.util.List;

import Detroy.Narincom.ClassB;
import Detroy.Narincom.ClassC;
import Detroy.Narincom.Softwore;
import Detroy.custom.Narin;

@Configuration
@ComponentScan(basePackages = {"Detroy", "Narincom"})
            //    excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {Student.class}))
// @ComponentScan(basePackageClasses = {Softwore.class})
public class Beancofig {

    // @Bean(initMethod = "Destroy")
    @Bean
    public Student student(){
        return new Student();
    };

    @Bean
    public String[] fruits(){
        return new String[]{"apple", "banana", "orange", "grape"};
    }

    @Bean
    public List<Subject> Objects(){
        return List.of(
            new Subject("math"),
            new Subject("Physic"),
            new Subject("khmer"),
            new Subject("sience")
        );

    }
}
