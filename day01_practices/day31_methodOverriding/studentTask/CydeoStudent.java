package day31_methodOverriding.studentTask;

public class CydeoStudent extends Student{

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {

        if(batchNumber <= 0){
            System.out.println("invalid batch number");
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber <=  0){
            System.out.println("invalid group number");
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage == null || programmingLanguage.isEmpty()){
            System.out.println("invalid programming language");
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " student is eating food ");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " student is drinking food ");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " student is sleeping");

    }

    @Override
    public String toString() {

        return "CydeoStudent{" +
                    super.toString().replace("}", "") +
                    "batchNumber=" + batchNumber +
                    ", groupNumber=" + groupNumber +
                    ", programmingLanguage='" + programmingLanguage + '\'' +
                    '}';
    }
}
