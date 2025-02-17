package prwork3;

public class Student implements Comparable<Student> {

    public String name;
    public int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
//        if (o.name.length() > this.name.length()) return -1;
//        else if (o.name.length() < this.name.length()) return 1;
//        return 0;
        return o.name.length() - this.name.length();
    }
}
