package org.example;

import java.util.ArrayList;

public class CU {
    private String nameCu;
    private ArrayList<Note> marks;
    private int totalStudents;

    public CU(String nameCu, int totalStudents) {
        this.nameCu = nameCu;
        this.totalStudents = totalStudents;
        this.marks = new ArrayList<Note>();
    }
    public String getNameCu() {
        return nameCu;
    }
    public void setNameCu(String nameCu) {
        this.nameCu = nameCu;
    }
    public void insertMarkCU(int numStudent, double Mark) {
        Note note = new Note(numStudent, Mark);
        marks.add(note);
    }
    public void searchStudfent(int numStudent) {
        for (Note note : marks) {
            if (note.getNumStudent() == numStudent) {
                System.out.println("Student found: " + note.getNumStudent() + " - " + note.getMark());
                return;
            }
        }
        System.out.println("Student not found");
    }
    public boolean isApproved(int numStudent) {
        for (Note note : marks) {
            if (note.getNumStudent() == numStudent) {
                return note.getMark() >= 9.5;
            }
        }
        return false;
    }
    public int getMarksSize() {
        return marks.size();
    }

}
