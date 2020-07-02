import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Student s1 = new Student(341553, "Matthew");
    Student s2 = new Student(525232, "Lily");
    Student s3 = new Student(002332, "Demi");
    Cohort cohort = new Cohort();

    @Before
    public void SetUp() {
        s1.addGrade(80);
        s1.addGrade(100);
        s2.addGrade(95);
        s2.addGrade(80);
        s3.addGrade(70);
        s3.addGrade(85);
    }

    @Test
    public void addStudent() {
        cohort.addStudent(s1);
        cohort.addStudent(s2);
        cohort.addStudent(s3);
    }

    @Test
    public void getList() {
        cohort.getStudents();
    }

    @Test
    public void getAverage() {
        cohort.getCohortAverage();
    }

}
