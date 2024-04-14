<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;


public class Student {

    public String fname, lname, email, address;
    public int IndexNumber;
    public ArrayList<Integer> grades = new ArrayList<>();

    public Student (String fname, String lname, String email, String address, int IndexNumber, List<Double> grades) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.IndexNumber = IndexNumber;
        this.grades = new ArrayList<>();

        }
    public String toString() {
        return "Student: " + fname + " " + lname + ", email: " + email + ", address: " + address + ", ID: " + IndexNumber + ", Oceny: " + grades;
        }


    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student nie ma żadnych ocen.");
        }

        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return roundToNearestHalf(sum / grades.size());
    }

    private double roundToNearestHalf(double value) {
        return Math.round(value * 2) / 2.0;
    }


























}

=======
import java.util.ArrayList;


public class Student {

    public String fname, lname, email, address;
    public int IndexNumber;
    public ArrayList<Integer> grades = new ArrayList<>();

    public Student (String fname, String lname, String email, String address, int IndexNumber) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;

        }
    }

>>>>>>> 3f9951350b38e0503a0f367560b33656e3c3bb63
