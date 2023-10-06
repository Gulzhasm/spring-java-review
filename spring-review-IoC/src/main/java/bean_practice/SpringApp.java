package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, NewConfigApp.class);

        String str = container.getBean("welcome", String.class);
        System.out.println(str);


        String str1 = container.getBean("core", String.class);
        System.out.println(str1);
    }
}
