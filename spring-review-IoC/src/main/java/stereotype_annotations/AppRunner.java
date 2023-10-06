package stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.config.Config;
import stereotype_annotations.models.DataStructure;
import stereotype_annotations.models.MicroService;

public class AppRunner {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        DataStructure dataStructure = container.getBean(DataStructure.class);
        MicroService microService = container.getBean(MicroService.class);
        dataStructure.getTotalHours();
        microService.getTotalHours();

    }
}
