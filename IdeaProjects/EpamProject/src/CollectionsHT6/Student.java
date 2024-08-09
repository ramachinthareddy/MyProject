package CollectionsHT6;
import java.util.HashMap;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    public class HashMapCustomObjectDemo {
        public static void main(String[] args) {
            HashMap<Integer, Student> map = new HashMap<>();

            Student student1 = new Student(1, "John");
            Student student2 = new Student(2, "Jane");

            map.put(1, student1);
            map.put(2, student2);

            System.out.println("HashMap: " + map);
        }
    }

}

