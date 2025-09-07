import java.util.List;

public class Student {

    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder sb) {
        this.rollNumber = sb.rollNumber;
        this.age = sb.age;
        this.name = sb.name;
        this.fatherName = sb.fatherName;
        this.motherName = sb.motherName;
        this.subjects = sb.subjects;
    }

    public String toString() {
        return "Roll number: " + this.rollNumber +
                " || Age: " + this.age +
                " || Name: " + this.name +
                " || Father name: " + this.fatherName +
                " || Mother name: " + this.motherName +
                " || Subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);
    }
}
