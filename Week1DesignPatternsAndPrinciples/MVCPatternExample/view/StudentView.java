package Week1DesignPatternsAndPrinciples.MVCPatternExample.view;

import Week1DesignPatternsAndPrinciples.MVCPatternExample.model.Student;

public class StudentView {
    public void displayStudentDetails(Student student) {
        System.out.println("Your are viewing the Student Details ");
        System.out.println("Name  : " + student.getName());
        System.out.println("ID    : " + student.getId());
        System.out.println("Grade : " + student.getGrade());
    }
}
