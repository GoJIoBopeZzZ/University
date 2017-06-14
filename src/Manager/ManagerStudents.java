package Manager;

import Manager.Interfaces.ManagerInterface;
import Models.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by _red_ on 14.06.17.
 */
public class ManagerStudents implements ManagerInterface {
    private List<Student> students = new ArrayList<>();

    public static final ManagerStudents INSTANCE = new ManagerStudents();

    @Override
    public void add (Object obj) {
        if (!students.contains(obj))
            students.add((Student) obj);
        else System.out.println("This group is already exists!!!");
    }

    @Override
    public boolean findObject (Object obj) {
        if (students.contains(obj)) return true;
        else return false;
    }

    public List<Student> getStudents () {
        return students;
    }

    public void setStudents (List<Student> students) {
        this.students = students;
    }
}
