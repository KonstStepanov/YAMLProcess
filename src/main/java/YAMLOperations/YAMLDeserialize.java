package YAMLOperations;

import YAMLClasses.Student;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class YAMLDeserialize {
    String YAML_IN_FOLDER = "./IN/student.yml";

    public YAMLDeserialize() {
    }

    public Student Deserialize() {
        InputStream inputStream;
        try {
            inputStream = new FileInputStream(YAML_IN_FOLDER);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        LoaderOptions options = new LoaderOptions();
        Yaml yaml = new Yaml(new Constructor(Student.class, options));
        return yaml.load(inputStream);
    }
}
