package day29_Inheritance;

public class Tester {

    private String name;
    private char gender;
    private int age;
    private String id, jobTitle;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'F' || gender == 'M'){
        this.gender = gender;
        }else{
            System.out.println("gender can only be M or F");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 ){
            System.out.println("Age can not be negative");
        }
        if(age < 18 || age > 65){
            System.out.println("invalid age");
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0)
        this.salary = salary;
    }
}
/*
1. Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the print statement


 */
