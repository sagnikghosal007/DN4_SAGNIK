package Week1DesignPatternsAndPrinciples.MVCPatternExample;

import Week1DesignPatternsAndPrinciples.MVCPatternExample.controller.StudentController;
import Week1DesignPatternsAndPrinciples.MVCPatternExample.model.Student;
import Week1DesignPatternsAndPrinciples.MVCPatternExample.view.StudentView;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Sagnik","CSE!","A+");
        StudentView view=new StudentView();
        StudentController controller=new StudentController(student,view);


        controller.updateView();

        controller.setStudentName("Sagnik Ghosal");
        controller.setStudentGrade("C");
        System.out.println("\n After Updating:");
        controller.updateView();
    }
}
