import java.util.ArrayList;

public class Student {
    private String name;
    private long studentId;
    private ArrayList<Integer> grades;
    private static long count;

    public Student(String name) {
        this();
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public Student() {
        count++;
        studentId = count;
        grades = new ArrayList<>();
    }

    public static long getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public void addGrade(int grade) {
        this.grades.add(grade);

    }

    public int getGradeAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

}
