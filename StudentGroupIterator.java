package prwork3;

import java.util.Arrays;
import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {


    private StudentGroup StudentGroup;

    private int index = 0;

    public StudentGroupIterator(StudentGroup group) {
        this.StudentGroup = group;
    }

    private Student[] getStudents() {
        String[] names = StudentGroup.students.toString().split(" ");
        Student[] students = new Student[names.length];
        int count = 0;
        for (String name : names) {
            students[count] = new Student(name, count);
            count++;
        }
//        System.out.println(Arrays.toString(names));
        return students;
    }

    @Override
    public boolean hasNext() {
        return getStudents().length > index;


    }

    @Override
    public Student next() {
        Student[] students = getStudents();
        return students[index++];
    }
}
