import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }
    // returns the student's id
    public long getId() {
        return this.id;
    }
    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades list
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double average = 0;
        for(int i = 0; i < grades.size(); i++) {
            average += grades.get(i);
        }
        return average / grades.size();
    }

}
