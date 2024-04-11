import java.util.ArrayList;
import java.util.List;

public class Student {
    private static final int MAX_GRADES = 20;

    public String firstName;
    public String lastName;
    public int age;
    public int indexNumber;
    public List<Double> grades;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        if (grades.size() >= MAX_GRADES) {
            throw new IllegalStateException("Limit studentów w grupie");
        }
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student nie ma ocen");
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double averageGrade = sum / grades.size();
        return Math.round(averageGrade * 2) / 2.0;
    }
}
