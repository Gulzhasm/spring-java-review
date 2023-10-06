package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NewConfigApp {

    @Primary
    @Bean(name = "welcome")
    String str(){
        return "Welcome to CydeoApp";
    }

    @Bean(name = "core")
    String str1(){
        return "Spring Core Practice";
    }
}
