import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private static final int MAX_STUDENTS = 15;

    public String groupName;
    public List<Student> students;

    public StudentGroup(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (students.size() >= MAX_STUDENTS) {
            throw new IllegalStateException("Grupa jest pełna");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Ten student już jest w tej grupie");
        }
        students.add(student);
    }
}
