package com.airtribe.learntrack.entity;

public class Student extends Person {

    private String batch;
    private boolean active;

    // Constructor without email (overloading)
    public Student(int id, String firstName, String lastName, String batch) {
        this(id, firstName, lastName, "NA", batch);
    }

    // Constructor with email
    public Student(int id, String firstName, String lastName, String email, String batch) {
        super(id, firstName, lastName, email);
        this.batch = batch;
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String getDisplayName() {
        return "Student: " + super.getDisplayName();
    }

    @Override
    public String toString() {
        return "ID=" + id +
                ", Name=" + firstName + " " + lastName +
                ", Email=" + email +
                ", Batch=" + batch +
                ", Active=" + active;
    }
}
