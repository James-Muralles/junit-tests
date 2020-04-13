import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student studentOne;

    @Before
    public void SetUpaddGrade() {
        studentOne = new Student("Jimmy");
        studentOne.addGrade(100);
        studentOne.addGrade(100);
        studentOne.addGrade(100);
        studentOne.addGrade(100);
    }


    @Test
    public void TestGetId() {
        long expected = studentOne.getStudentId();
        assertEquals(expected, studentOne.getStudentId());
    }

    @Test
    public void testGetName() {
        String expected = "Jimmy";
        assertEquals(expected, studentOne.getName());
    }

    @Test
    public void testAddGrade() {
        Student me = new Student("James");
        me.addGrade(98);
        assertNotNull(me.getGrades());

    }

    @Test
    public void TestSetName(){
        Student b = new Student();
        b.setName("Hank");
        assertEquals("Hank", b.getName());

    }

    @Test

    public void testAddingGradesAndAveraging() {
        Student student = new Student();
        student.addGrade(100);
        student.addGrade(95);
        student.addGrade(90);
        int expected = 95;
        assertEquals("Testing Grade Average ", 95, student.getGradeAverage());
    }


}
