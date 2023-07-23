package util;
import util.Grade;

public class GradeTest {
    public GradeTest() {
        Grade[] grades =Grade.values();

        for(Grade grade : grades){
            System.out.println(grade.toString());
        }
    }
}
