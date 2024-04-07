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

