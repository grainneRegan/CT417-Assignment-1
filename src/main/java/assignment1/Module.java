package assignment1;

import java.util.ArrayList;

public class Module {
    private String moduleName;
    private int id;
    private ArrayList ArrayListOfStudents;
    private ArrayList associatedCourses;
    private String lecturerResponsible;

    public Module(String moduleName, int id, String lecturerResponsible) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getLecturerResponsible() {
        return lecturerResponsible;
    }

    public void setLecturerResponsible(String lecturerResponsible) {
        this.lecturerResponsible = lecturerResponsible;
    }
}
