package assignment1;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private String dateOfBirth;
    private int id;
    private String studentUserName;
    private List courses;
    private List modules;

    CoursePackage coursePackage;

    public Student(String name, int age, String dateOfBirth, int id) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        createStudentUserName(name, age);
    }

    public List getModulesTakenByStudent(List<CoursePackage> courses){
        for(CoursePackage course:courses){
            modules.add(course.getRequiredModules());
        }
        return this.modules;
    }

    public void addModule(Module module){
        modules.add(module);
    }

    public void addCourse(CoursePackage course){
        courses.add(course);
    }

    public void removeCourse(CoursePackage course){
        courses.remove(course);
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

    public List getCourses() {
        return courses;
    }

    public List getModules() {
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

    public void setCourses(List courses) {
        this.courses = courses;
    }

    public void setModules(List modules) {
        this.modules = modules;
    }
}
