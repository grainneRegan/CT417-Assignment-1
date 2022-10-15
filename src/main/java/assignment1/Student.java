package assignment1;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String dateOfBirth;
    private int id;
    private String studentUserName;
    private ArrayList courses;
    private ArrayList modules;

    CoursePackage coursePackage;

    public Student(String name, int age, String dateOfBirth, int id) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        courses = new ArrayList<CoursePackage>();
        modules = new ArrayList<Module>();
        createStudentUserName(name, age);
    }

    //adds a module to the list of modules taken by a student
    public void addModule(Module module){
        modules.add(module);
    }

    //adds course to list of courses taken by student
    public void addCourse(CoursePackage course){
        courses.add(course);
    }

    //removes any course that the student no longer takes and also any associated course
    public void removeCourse(CoursePackage course){
        for(Module module:course.getRequiredModules()){
            modules.remove(module);
        }
        courses.remove(course);
    }

    //removes any module that the student no longer takes
    public void removeModule(Module module){
        modules.remove(module);
    }
    public String createStudentUserName(String name, int age){
        return this.studentUserName = name + age;
    }

    public String getStudentUserName(){
        return studentUserName;
    }

    public void setStudentUserName(String userName) {
        this.studentUserName = userName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public ArrayList getCourses() {
        return courses;
    }

    public ArrayList getModules() {
        return modules;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourses(ArrayList courses) {
        this.courses = courses;
    }

    public void setModules(ArrayList modules) {
        this.modules = modules;
    }
}
