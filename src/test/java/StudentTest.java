import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student s1 = new Student(341553, "Matthew");

    @Before
    public void SetUp() {
        s1.addGrade(80);
        s1.addGrade(100);
    }

    @Test
    public void getStudentID() {
        assertEquals(90, s1.getGradeAverage(), 0);
    }

}
