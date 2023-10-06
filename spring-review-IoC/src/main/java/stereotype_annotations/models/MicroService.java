package stereotype_annotations.models;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MicroService {
    ExtraHours extraHours;

    public void getTotalHours() {
        System.out.println("Total hours: " + (30 + extraHours.getHours()));
    }
}
