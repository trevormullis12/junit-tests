import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {

    @Test
    public void testIfAddStudentWorks(){
        Cohort apex = new Cohort();
        Student fer = new Student(1L, "Fer");
        Student douglas = new Student(3L, "douglas");
        apex.addStudent(fer);
        apex.addStudent(douglas);
        assertEquals(1L, apex.getStudents().get(0).getId());
        assertEquals(3L, apex.getStudents().get(1).getId());
        assertEquals("Fer", apex.getStudents().get(0).getName());
    }

    @Test
    public void testIfGetStudentsWorks(){
        Cohort apex = new Cohort();
        assertEquals(0, apex.getStudents().size());
        Student fer = new Student(1L, "Fer");
        apex.addStudent(fer);
        assertEquals(1, apex.getStudents().size());
    }

    @Test
    public void testIfAvgWorks(){
        Cohort apex = new Cohort();
        Student fer = new Student(1L, "Fer");
        fer.addGrade(100);
        fer.addGrade(100);
        // 100 + 100 / 2 = 100
        Student douglas = new Student(3L, "douglas");
        douglas.addGrade(80);
        douglas.addGrade(100);
        // 80 + 100 / 2 = 90
        apex.addStudent(fer);
        apex.addStudent(douglas);
        // 190 / 2 == 95
        assertEquals(95, apex.getCohortAverage(), 0);
    }

}