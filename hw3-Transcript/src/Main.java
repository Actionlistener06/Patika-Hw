import main.CourseGrade;
import main.Transcript;
import util.Grade;
import util.GradeTest;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        CourseGrade course1 = new CourseGrade(CourseGrade.CourseDepartment.CENG, 201, 4, Grade.D);
        CourseGrade course2 = new CourseGrade(CourseGrade.CourseDepartment.ME, 601, 4, Grade.A); // Varsayılan courseCode atanır.
        CourseGrade course3 = new CourseGrade(CourseGrade.CourseDepartment.COMP, 201, 5, Grade.C);
        CourseGrade course4 = new CourseGrade(CourseGrade.CourseDepartment.ECE, 201, 3, Grade.F);
        CourseGrade course5 = new CourseGrade(CourseGrade.CourseDepartment.MATH, 101, 4, Grade.B);

        Transcript transcript = new Transcript("1234234");


        transcript.addCourseTaken(course1);
        transcript.addCourseTaken(course2);
        transcript.addCourseTaken(course3);
        transcript.addCourseTaken(course4);
        transcript.addCourseTaken(course5);

        System.out.print(transcript);
        System.out.println(course1);
    }

}
