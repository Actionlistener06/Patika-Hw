package main;

import util.Grade;

public class CourseGrade {
    private CourseDepartment courseDepartment=CourseDepartment.CENG;
    private int courseCode;
    private int courseCredit;
    private Grade gradeTaken;

    public enum CourseDepartment {
        CENG,
        COMP,
        ECE,
        ME,
        MATH
    }

    public CourseGrade(CourseDepartment courseDepartment, int courseCode, int courseCredit, Grade gradeTaken) {
        this.courseDepartment = courseDepartment;
        this.courseCode = courseCode;
        this.courseCredit = courseCredit;
        this.gradeTaken = gradeTaken;
    }

    @Override
    public String toString() {
        String result = "Department: " + courseDepartment + " Course Code: " + courseCode + " Credit: " + courseCredit + " Grade: " + gradeTaken;
        return result;
    }

    public CourseDepartment getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(CourseDepartment courseDepartment) {
        this.courseDepartment = courseDepartment;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        if(courseCode>=100 && courseCode<=599){
        this.courseCode = courseCode;
    }
        else this.courseCode=100;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        if(courseCredit==3|| courseCredit==4){
        this.courseCredit = courseCredit;
    }
        else this.courseCredit=4;
    }

    public Grade getGradeTaken() {
        return gradeTaken;
    }

    //Round islemi Grade enum getGrade methodu icinde yapildi
    public void setGradeTaken(double val){
       this.gradeTaken= Grade.getGrade(val);
    }
    public void setGradeTaken(Grade gradeTaken) {
        this.gradeTaken = gradeTaken;
    }
}


