package assignment1;

import java.util.ArrayList;

public class Lecturer {
    private String name;
    private int age;
    private String dateOfBirth;
    private int id;
    private String lecturerUserName;
    private ArrayList modulesTeaching;

    public Lecturer(String name, int age, String dateOfBirth, int id) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        //an empty arrayList is created in constructor instead of passing in list of modules
        ArrayList modulesTeaching = new ArrayList<Module>();
        createLecturerUserName(name, age);
    }
    //creates a username for lecturer and is called in constructor
    public String createLecturerUserName(String name, int age){
        return this.lecturerUserName = name + age;
    }

    //allows module to be added to list of modules taught by lecturer
    public void addModule(Module module){
        this.modulesTeaching.add(module);
    }

    public String getLecturerUserName(String name, int age) {
        return lecturerUserName;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList getModulesTeaching() {
        return modulesTeaching;
    }

    public void setModulesTeaching(ArrayList modulesTeaching) {
        this.modulesTeaching = modulesTeaching;
    }
}
