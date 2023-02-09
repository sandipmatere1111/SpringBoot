package com.example.demo4.entities;

public class MyCourse {
    private int id;
    private String course;
    private int marks;

    public MyCourse(int id, String course, int marks) {
        this.id = id;
        this.course = course;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course='" + course + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }

    public MyCourse() {
        super();
    }
}
