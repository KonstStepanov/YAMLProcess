import YAMLClasses.Student;
import YAMLOperations.YAMLDeserialize;
import YAMLOperations.YAMLSerialize;

public class Main {
    public static void main(String[] args) {
        Student student = new YAMLDeserialize().Deserialize();
        System.out.println(student);

        new YAMLSerialize().Serialize(student);
    }
}