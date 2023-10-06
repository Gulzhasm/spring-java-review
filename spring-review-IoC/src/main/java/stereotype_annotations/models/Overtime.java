package stereotype_annotations.models;

public class Overtime implements Hours {
    @Override
    public Integer hours() {
        return 15;
    }
}
