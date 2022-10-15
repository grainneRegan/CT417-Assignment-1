package assignment1;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class CoursePackage {
    private String courseName;
    private ArrayList studentsEnrolled;
    private ArrayList requiredModules;
    private DateTime startDate;
    private DateTime endDate;

    Module module;

    public CoursePackage(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        ArrayList requiredModules = new ArrayList<Module>();
        ArrayList studentsEnrolled = new ArrayList<Student>();
    }

    //add additional module to course
    public void addModuleToCourse(Module module){
        requiredModules.add(module);
    }

    //adds student to each module required by the course they are joining
    public void addStudentsToCourse(Student student){
        studentsEnrolled.add(student);
        for(Module module:getRequiredModules()){
            module.addStudent(student);
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public ArrayList<Module> getRequiredModules() {
        return requiredModules;
    }

    public void setRequiredModules(ArrayList requiredModules) {
        this.requiredModules = requiredModules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
