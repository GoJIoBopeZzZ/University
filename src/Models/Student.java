package Models;

import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by _red_ on 08.06.17.
 */
public class Student {
    private String name;
    private String surName;
    private String lastName;
    private Date age;
    private Long groupID;
    private Long id;
    private List<Contact> contacts;

    public Student(String name, String surName, String lastName, Date age, Long groupID) {
        this.name = name;
        this.surName = surName;
        this.lastName = lastName;
        this.age = age;
        this.groupID = groupID;
        this.id = System.currentTimeMillis();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id != null ? id.equals(student.id) : student.id == null;
    }

    @Override
    public int hashCode() {
        return (int) (21 + getId() * 42);
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
