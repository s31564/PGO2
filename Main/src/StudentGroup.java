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
