import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", "kowalski@email.com", "1111", 1, Arrays.asList(2.0, 3.5, 4.5));
        Student student2 = new Student("Anna", "Kowalska", "kowalska@email.com", "2222", 2, Arrays.asList(5.0, 3.5, 5.0));
        Student student3 = new Student("Adam", "Nowak", "nowak@email.com", "3333", 3, Arrays.asList(5.0, 3.5, 4.0));


        StudentGroup group1 = new StudentGroup("Grupa A");
        StudentGroup group2 = new StudentGroup("Grupa B");


        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);


        System.out.println(group1);
        System.out.println(group2);


        System.out.println("Średnia ocen studenta 1: " + calculateAverage(student1));
        System.out.println("Średnia ocen studenta 2: " + calculateAverage(student2));
        System.out.println("Średnia ocen studenta 3: " + calculateAverage(student3));
    }

    public static double calculateAverage(Student student) {
        List<Integer> grades = student.grades;
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student nie ma żadnych ocen.");
        }

        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }













}
