public class Director {

    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineerStudent) {
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MedicalStudent) {
            return createMedicalStudent();
        }
        return null;
    }

    private Student createEngineeringStudent(){
       return studentBuilder.setRollNumber(1).setAge(22).setName("Abcd").setSubjects().build();
    }

    private Student createMedicalStudent(){
        return studentBuilder.setRollNumber(2).setAge(24).setName("Efgh").setFatherName("MyFatherName").setMotherName("MyMotherName").setSubjects().build();
    }

}
