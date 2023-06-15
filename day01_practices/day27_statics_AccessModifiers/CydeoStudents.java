package day27_statics_AccessModifiers;

public class CydeoStudents {

    public String name;
    public int age;
    public char gender;
    public int batchNumber;
    public static String schoolName,fieldOfStudy,programingLanguage, secretCode;

    public CydeoStudents(String name, int age, char gender, int batchNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.batchNumber = batchNumber;
    }

    static {

        schoolName = "cydeo";
        fieldOfStudy = "";
        programingLanguage = "Java";
        secretCode = "";
    }

    public void  printSecretCode(){

        System.out.println("secret code is: " + secretCode);
    }

    public void  attendClass(){

        System.out.println(name + " is attending class");

    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batchNumber=" + batchNumber + ", school name=" + schoolName + ", fieldOfStudy=" + fieldOfStudy + ",programing language=" + programingLanguage + "secret code= " + secretCode +
                '}';
    }
}
/*
2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:

                printSecretCode();
                attendClass():
                study()
                toString()
 */
