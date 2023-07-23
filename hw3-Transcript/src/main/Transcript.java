package main;

import java.util.ArrayList;

public class Transcript {
    private String studentID;
    private ArrayList<CourseGrade> courseGrades;
    private double GPA;

    public Transcript(String studentID) {
        this.studentID=studentID;
        this.courseGrades=new ArrayList<CourseGrade>();
    }

    public Transcript(String studentID, ArrayList<CourseGrade> courseGrades, double GPA) {
        this.studentID = studentID;
        this.courseGrades = new ArrayList<CourseGrade>();
        this.GPA = 0.00;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: " + studentID + "\n");
        for (CourseGrade cg : courseGrades) {
            sb.append("Department: " + cg.getCourseDepartment() + " Code: " +
                    cg.getCourseCode() + " Credit: " + cg.getCourseCredit() + " Grade: " + cg.getGradeTaken() + "\n");
        }
        sb.append("GPA: " + GPA + "\n");
        return sb.toString();
    }

    public void addCourseTaken(CourseGrade courseGrade){
        if(courseGrade!=null) {
            courseGrades.add(courseGrade);
            double totalGradePoints = 0.0;
            int totalCredits = 0;
            for (CourseGrade cg : courseGrades) {
                totalGradePoints += cg.getCourseCredit() * cg.getGradeTaken().getGradeValue();
                totalCredits += cg.getCourseCredit();
            }
            this.GPA = totalGradePoints / totalCredits;
        }
        else System.out.println("Null deger girilemeZ");
    }
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studenID) {
        this.studentID = studenID;
    }

    public ArrayList<CourseGrade> getCourseGrades() {
        return courseGrades;
    }

    public void setCourseGrades(ArrayList<CourseGrade> courseGrades) {
        if(courseGrades!=null){
        this.courseGrades = courseGrades;
    }}

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        if(GPA>=0.0 && GPA<=4.0){
        this.GPA = GPA;
    }else System.out.println("Invalid GPA");
    }
}
