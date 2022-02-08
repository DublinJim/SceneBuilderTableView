package com.example.scenebuildertableview;

public class Student {

    private String firstName;
    private String lastName;
    private int studentId;


    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public Student() {
        firstName = "";
        lastName = "";
        studentId = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /* end of methods// */
}
