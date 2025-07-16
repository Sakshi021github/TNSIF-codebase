package com.tns.D13.Collections;

import java.util.Objects;

public class StudentSetDemo {
    private int id;
    private String name;
    private double marks;

    public StudentSetDemo(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // same object
        if (o == null || getClass() != o.getClass()) return false; // null or different class
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
        // You can also include marks if you want marks to be part of equality
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
        // Include marks if used in equals
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
    }
}
