import java.util.ArrayList;

class Repository<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void save(T item) {
        list.add(item);
    }

    public void display() {
        for (T obj : list) {
            System.out.println(obj);
        }
    }
}

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class Main {

    public static void main(String[] args) {

        Repository<Student> repo = new Repository<>();

        repo.save(new Student("Aditi"));
        repo.save(new Student("Rahul"));

        repo.display();
    }
}