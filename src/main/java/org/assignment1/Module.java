package org.assignment1;

import java.util.ArrayList;

public class Module {
    private String moduleName;
    private String id;
    private ArrayList ArrayListOfStudents;
    private ArrayList associatedCourses;
    private Lecturer lecturerResponsible;

    public Module(String moduleName, String id, Lecturer lecturerResponsible) {
        this.moduleName = moduleName;
        this.id = id;
        ArrayList students = new ArrayList<Student>();
        this.lecturerResponsible = lecturerResponsible;
    }

    //add student to list of students taking a module
    public void addStudent(Student student){
        ArrayListOfStudents.add(student);
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList getArrayListOfStudents() {
        return ArrayListOfStudents;
    }

    public void setArrayListOfStudents(ArrayList ArrayListOfStudents) {
        this.ArrayListOfStudents = ArrayListOfStudents;
    }

    public ArrayList getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public Lecturer getLecturerResponsible() {
        return lecturerResponsible;
    }

    public void setLecturerResponsible(Lecturer lecturerResponsible) {
        this.lecturerResponsible = lecturerResponsible;
    }
}
