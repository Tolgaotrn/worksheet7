package org.example;

public class Note {
    private int numStudent;
    private double mark;

    public Note(int NumStudent, double Mark) {
        this.numStudent = NumStudent;
        this.mark = Mark;
    }
    public int getNumStudent() {
        return numStudent;
    }
    public double getMark() {
        return mark;
    }
}
