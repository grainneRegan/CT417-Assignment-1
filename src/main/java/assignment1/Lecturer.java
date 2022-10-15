package assignment1;

import java.time.LocalDate;
import java.util.List;

public class Lecturer {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private int id;
    private String lecturerUserName;
    private List modulesTeaching;

    public Lecturer(String name, int age, LocalDate dateOfBirth, int id, List modulesTeaching) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.modulesTeaching = modulesTeaching;
        createLecturerUserName(name, age);
    }

    private void createLecturerUserName(String name, int age){
        this.lecturerUserName = name + age;
    }

    public void addModule(Module module){
        modulesTeaching.add(module);
    }

    public String getLecturerUserName(String name, int age) {
        return name + age;
    }

    public void setLecturerUserName(String userName) {
        this.lecturerUserName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List getModulesTeaching() {
        return modulesTeaching;
    }

    public void setModulesTeaching(List modulesTeaching) {
        this.modulesTeaching = modulesTeaching;
    }
}
