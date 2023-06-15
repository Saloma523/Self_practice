package day26_constructors_statics;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public String id;
    public int catchNumber;
    public int groupNumber;
    public static String schoolName = "Cydeo" ;
    public static String magicWord = "";

    public CydeoStudent(String name, int age, char gender, String id, int catchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.catchNumber = catchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void attendClass(){
        System.out.println(name + " attend class");
    }

    public static void printSchoolName(){
        System.out.println("school name: " + schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("Programing language: " + magicWord);

    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", catchNumber=" + catchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */
