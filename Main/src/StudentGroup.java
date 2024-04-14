<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
public class StudentGroup {
    public static final int MaksymalnaIloscStudentow = 15;
    public String groupName;
    public List<Student> students;

    public StudentGroup(String groupName) {

        this.groupName = groupName;
        this.students = new ArrayList<>();
        }

    public void addStudent(Student student) {
        if (students.size() >= MaksymalnaIloscStudentow) {
            throw new IllegalStateException("Brak miejsc w grupie");
        }

        if (students.contains(student)) {
            throw new IllegalStateException("Student o tym indeksie jest już w grupie");
        }

        students.add(student);
    }

    public void usunStudenta(Student student) {
        students.remove(student);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Student Group: ").append(groupName).append("\n");
        stringBuilder.append("Students: \n");
        for (Student student : students) {
            stringBuilder.append(student).append("\n");
        }
        return stringBuilder.toString();
    }








}
=======
import java.util.ArrayList;
import java.util.List;
public class StudentGroup {

    public String groupName;
    public List<Student> students;

    public StudentGroup(String groupName){

        this.groupName = groupName;
        this.students = new ArrayList<>();
    }

    
}
>>>>>>> 3f9951350b38e0503a0f367560b33656e3c3bb63
