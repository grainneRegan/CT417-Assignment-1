package assignment1;

import java.util.List;

public class Module {
    private String moduleName;
    private int id;
    private List listOfStudents;
    private List associatedCourses;
    private String lecturerResponsible;

    public Module(String moduleName, int id, List listOfStudents, List associatedCourses, String lecturerResponsible) {
        this.moduleName = moduleName;
        this.id = id;
        this.listOfStudents = listOfStudents;
        this.associatedCourses = associatedCourses;
        this.lecturerResponsible = lecturerResponsible;
    }

    public void addStudent(Student student){
        listOfStudents.add(student);
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

    public List getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public List getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(List associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public String getLecturerResponsible() {
        return lecturerResponsible;
    }

    public void setLecturerResponsible(String lecturerResponsible) {
        this.lecturerResponsible = lecturerResponsible;
    }
}
