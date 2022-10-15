package assignment1;

import org.joda.time.DateTime;

import java.util.List;

public class CoursePackage {
    private String courseName;
    private List studentsEnrolled;
    private List requiredModules;
    private DateTime startDate;
    private DateTime endDate;

    Module module;

    public CoursePackage(String courseName, List studentsEnrolled, List<Module> requiredModules, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.studentsEnrolled = studentsEnrolled;
        this.requiredModules = requiredModules;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addModuleToCourse(Module module){
        requiredModules.add(module);
    }

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

    public List getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(List studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public List<Module> getRequiredModules() {
        return requiredModules;
    }

    public void setRequiredModules(List requiredModules) {
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
