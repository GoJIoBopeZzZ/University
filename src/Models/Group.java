package Models;

import java.util.*;
import java.util.Iterator;

/**
 * Created by _red_ on 08.06.17.
 */
public class Group implements Iterable{
    private String name;
    private int groupID;
    private List<Student> students;

    @Override
    public Iterator<Student> iterator() {
        return this.students.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Group)) return false;

        Group group = (Group)o;
        return (groupID == group.groupID);
    }

    @Override
    public int hashCode() {
        return (int)(groupID * 41 + 21);
    }

    public Group(String name) {
        this(name, null);
    }

    public Group(String name, List<Student> students) {
        this.name = name;
        this.groupID = this.name.hashCode() * 21 + this.name.hashCode() * 42;
        this.students = (students == null) ? new ArrayList<>() : students;
    }

    public void addStudent(Student student) {
        if (student != null)
            for (Student entry : students)
                if (entry.equals(student)) {
                    System.out.println("TThis student already exists");
                    return;
                }
            this.students.add(student);
    }

    public void addAllStudent(List<Student> student) {
        for (Student entry : student) {
            if (entry != null)
                if (entry.equals(student)) {
                    System.out.println("This student already exists - " + entry);
                    continue;
                }
            this.students.add(entry);
        }
    }

    public void clearGroup() {
        this.students.clear();
    }

    public void removeStudent(Student student) {
        if (student != null)
            this.students.remove(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupID() {
        return groupID;
    }

    public List<Student> getStudents() {
        return students;
    }
}
