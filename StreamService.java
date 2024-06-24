package prwork3;

import java.util.Collections;
import java.util.List;

public class StreamService {
    public void sort(List<Stream> arrList){
        Collections.sort(arrList, new StreamComporator());
    }

}
