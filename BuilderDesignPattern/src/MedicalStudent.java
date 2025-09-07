import java.util.ArrayList;
import java.util.List;

public class MedicalStudent extends StudentBuilder{

    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Micro Biology");
        subs.add("Physics");
        subs.add("Cardiology");
        this.subjects = subs;
        return this;
    }

}
