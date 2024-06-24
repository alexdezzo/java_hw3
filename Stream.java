package prwork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{

    public List<StudentGroup> studentGroup = new ArrayList<>();

    public void addGroups(StudentGroup group){
        studentGroup.add(group);
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }


    @Override
    public String toString() {
        return studentGroup.toString();
    }
}
