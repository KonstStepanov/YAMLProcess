package YAMLClasses;

import java.util.List;

public class Student extends Person {
    private int year;
    private String department;
    private List<Course> courses;

    public Student() {
    }

    public Student(long id, String name, String address, int year, String department, List<Course> courses) {
        super(id, name, address);
        this.year = year;
        this.department = department;
        this.courses = courses;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getYear() {
        return year;
    }

    public String getDepartment() {
        return department;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "year=" + year +
                ", department='" + department + '\'' +
                ", courses=" + courses +
                '}';
    }
}