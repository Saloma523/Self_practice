package day31_methodOverriding.studentTask;

public class StudentObject {

    public static void main(String[] args) {

        Person person = new Person("Salma",32,'F');
        Student student = new Student("Omnia",32,'F',"A4","3rd",'B',"Rockledge");
        GraduateStudent graduateStudent = new GraduateStudent("Manar",10,'F', "B24","4th",'A',"Rockledge");

        System.out.println(person);
        System.out.println(student);
        System.out.println(graduateStudent);

        person.eat();
        student.eat();
        graduateStudent.eat();

        student.study();





    }
}
