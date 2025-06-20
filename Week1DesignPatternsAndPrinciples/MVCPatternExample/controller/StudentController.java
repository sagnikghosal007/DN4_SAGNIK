package Week1DesignPatternsAndPrinciples.MVCPatternExample.controller;

import Week1DesignPatternsAndPrinciples.MVCPatternExample.model.Student;
import Week1DesignPatternsAndPrinciples.MVCPatternExample.view.StudentView;

public class StudentController {

    private Student student;
    private StudentView studentView;
    public StudentController(Student student,StudentView studentView){
        this.student=student;
        this.studentView=studentView;
    }

    public void setStudentName(String name) {
        student.setName(name);
    }

    public void setStudentId(String id) {
        student.setId(id);
    }

    public void setStudentGrade(String grade) {
        student.setGrade(grade);
    }

    public void updateView() {
        studentView.displayStudentDetails(student);
    }




}
