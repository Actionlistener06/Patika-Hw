package util;

public enum Grade {
    A(4, "A"),
    B(3, "B"),
    C(2, "C"),
    D(1, "D"),
    F(0, "F");

    private final int gradeValue;
    private final String gradeText;

    private Grade(int gradeValue, String gradeText) {
        this.gradeValue = gradeValue;
        this.gradeText = gradeText;
    }

    public int getGradeValue() {
        return gradeValue;
    }

    public String getGradeText() {
        return gradeText;
    }

    public static Grade getGrade(double value) {
        Grade grade=F;
        for(Grade g : values()) {
            if(Math.round(value) == g.gradeValue) {
                grade = g;
            }
        }
        return grade;
    }

    @Override
    public String toString() {
        return  this.gradeText;
    }
}
