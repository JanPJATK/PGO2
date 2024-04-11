public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Dżoł", "Bajden", 20);
        Student student2 = new Student("Olaf", "Szolc", 21);


        student1.addGrade(4.5);
        student1.addGrade(3.0);
        student2.addGrade(5.0);
        student2.addGrade(4.0);

        try {
            System.out.println("Średnia ocen Dżoł Bajdena: " + student1.calculateAverageGrade());
            System.out.println("Średnia ocen Olafa Szolca: " + student2.calculateAverageGrade());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        StudentGroup group = new StudentGroup("Grupa A");


        try {
            group.addStudent(student1);
            group.addStudent(student2);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
