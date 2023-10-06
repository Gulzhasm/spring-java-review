package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Bean(name = "str")
    FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee();
    }

    @Bean(name = "str1")
    PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }
}
