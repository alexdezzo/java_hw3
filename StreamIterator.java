package prwork3;

import java.util.Iterator;

public class StreamIterator implements Iterator<StudentGroup> {
    private Stream stream;
    private int index = 0;


    public StreamIterator(Stream stream) {
        this.stream = stream;
    }


    @Override
    public boolean hasNext() {
        return stream.studentGroup.size() > index;
    }

    @Override
    public StudentGroup next() {
        return stream.studentGroup.get(index++);
    }

}
