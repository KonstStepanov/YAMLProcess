package YAMLOperations;

import YAMLClasses.Course;
import YAMLClasses.Student;
import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class YAMLSerialize {
    String YAML_OUT_FOLDER = "./OUT/student_output.yml";

    public YAMLSerialize() {
    }

    public void Serialize(Student student) {

        Course courseOne = new Course("Алгоритмы", 1);
        Course courseTwo = new Course("Проектирование", 1);

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseOne);
        courseList.add(courseTwo);

        student.setId(2);
        student.setName("Иван");
        student.setAddress("Вологда");
        student.setYear(2023);
        student.setDepartment("Разработка");
        student.setCourses(courseList);

        PrintWriter writer;
        try {
            writer = new PrintWriter(YAML_OUT_FOLDER);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Yaml yamlOut = new Yaml();
        yamlOut.dump(student, writer);
        System.out.print("File created!");
    }
}
