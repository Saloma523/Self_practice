package day17_classAndObjects;

public class Students {

    public String name;
    public char gender;
    public String id;
    public int grade;
    public boolean isFullTime;


    public void setInfo(String name, char gender, String id, int grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void study(){
        System.out.println(name + " is studying");
    }
}
/*
Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()
 */
