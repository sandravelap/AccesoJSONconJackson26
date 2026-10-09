package models;

import java.util.ArrayList;

public class Highschool {
    private String educationalCenter;
    private String academicYear;
    private ArrayList<Student> students;

    public Highschool() {
    }

    public String getEducationalCenter() {
        return educationalCenter;
    }

    public void setEducationalCenter(String educationalCenter) {
        this.educationalCenter = educationalCenter;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
