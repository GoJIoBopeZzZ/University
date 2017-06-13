package Models;

import java.io.Serializable;
import java.util.*;

/**
 * Created by _red_ on 08.06.17.
 */
public class Student implements Serializable{
    private String name;
    private String surName;
    private String lastName;
    private String birthday;
    private boolean sex;
    private Passport passport;
    private Group group;
    private Long id;
    private List<Contact> contacts;

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

    @Override
    public String toString() {
        return name + "/" + surName + "/" + lastName + ": id" + id.toString();
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSurName () {
        return surName;
    }

    public void setSurName (String surName) {
        this.surName = surName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday () {
        return birthday;
    }

    public void setBirthday (String birthday) {
        this.birthday = birthday;
    }

    public boolean isSex () {
        return sex;
    }

    public void setSex (boolean sex) {
        this.sex = sex;
    }

    public Passport getPassport () {
        return passport;
    }

    public void setPassport (Passport passport) {
        this.passport = passport;
    }

    public Group getGroup () {
        return group;
    }

    public void setGroup (Group group) {
        this.group = group;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public List<Contact> getContacts () {
        return contacts;
    }

    public void setContacts (List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Student(String name, String surName, String lastName, String birthday, Group group) {
        this.name = name;
        this.surName = surName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.group = group;
        this.id = name.hashCode() * System.currentTimeMillis() +
            lastName.hashCode() * System.currentTimeMillis() +
            lastName.hashCode() * System.currentTimeMillis();
        this.contacts = new ArrayList<>();
    }
//    Passport class for student uniqueness
    class Passport {
        private int serial;
        private int number;

        public Passport(int serial, int number) {
            this.serial = serial;
            this.number = number;
        }

        public int getSerial () {
            return serial;
        }

        public void setSerial (int serial) {
            this.serial = serial;
        }

        public int getNumber () {
            return number;
        }

        public void setNumber (int number) {
            this.number = number;
        }

        @Override
        public boolean equals (Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Passport passport = (Passport) o;

            if (serial != passport.serial) return false;
            return number == passport.number;
        }

        @Override
        public int hashCode () {
            return 1488 * serial + 1488 * number;
        }
    }
}
