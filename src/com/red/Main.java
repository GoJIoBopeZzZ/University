package com.red;

import Manager.ManagerGroups;
import Manager.ManagerStudents;
import Models.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Student s = new Student("Vasia", "Pupkin",
                "Aristarhovich", "18..11.1990", "HZ");
        System.out.println(ManagerStudents.INSTANCE);
        ManagerStudents.INSTANCE.add(s);
        System.out.println(ManagerStudents.INSTANCE.getStudents());
    }

    public static void studentsSerialization(String path, List<Student> students){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Student> studentsDeserialization(String path){
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return students;
    }
}
