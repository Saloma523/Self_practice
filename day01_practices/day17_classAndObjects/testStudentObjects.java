package day17_classAndObjects;

public class testStudentObjects {
    public static void main(String[] args) {

        Students student1 = new Students();

        student1.setInfo("salma",'F',"A1122",12,true);

        student1.study();
        System.out.println(student1);


    }
}
