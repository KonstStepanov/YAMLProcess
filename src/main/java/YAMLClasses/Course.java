package YAMLClasses;

public class Course {
    private String name;
    private double credits;

    public Course() {
    }

    public Course(String name, double credits) {
        this.name = name;
        this.credits = credits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public double getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }
}