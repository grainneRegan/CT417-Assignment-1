package org.assignment1;

import java.util.ArrayList;

public class Module {
    private String moduleName;
    private String id;
    private ArrayList students;
    private ArrayList associatedCourses;
    private Lecturer lecturerResponsible;

    public Module(String moduleName, String id, Lecturer lecturerResponsible) {
        this.moduleName = moduleName;
        this.id = id;
        students = new ArrayList<Student>();
        associatedCourses = new ArrayList<CoursePackage>();
        this.lecturerResponsible = lecturerResponsible;
    }

    //add student to list of students taking a module
    public void addStudent(Student student){
        students.add(student);
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

    public ArrayList<Student> getArrayListOfStudents() {
        return students;
    }

    public void setArrayListOfStudents(ArrayList ArrayListOfStudents) {
        this.students = ArrayListOfStudents;
    }

    public ArrayList<CoursePackage> getAssociatedCourses() {
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
