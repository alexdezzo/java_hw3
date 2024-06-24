package prwork3;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        StudentGroup studentGroup1 = new StudentGroup("Group12");
        StudentGroup studentGroup2 = new StudentGroup("Group23");
        StudentGroup studentGroup3 = new StudentGroup("Group35");


        Stream stream1 = new Stream();
        Stream stream2 = new Stream();

        stream1.addGroups(studentGroup1);
        stream2.addGroups(studentGroup2);
        stream2.addGroups(studentGroup3);

        System.out.println("Grouops " + stream2);



        Iterator<StudentGroup>iterator = new StreamIterator(stream2);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<Stream> arrayList = new ArrayList<>(List.of(stream1, stream2));
        System.out.println(arrayList);

        Collections.sort(arrayList,(s1, s2) -> s1.studentGroup.size() - s2.studentGroup.size());

        System.out.println(arrayList);




        Student ivan = new Student("Ivan", 1);
        Student alexey = new Student("Alexey", 2);
        Student alexander = new Student("Alexander", 3);
        Student dmitriy = new Student("Dmitriy", 4);




//        studentGroup.addStudent(ivan);
//        studentGroup.addStudent(alexander);
//        studentGroup.addStudent(alexey);





//        System.out.println(studentGroup);

//        System.out.println(ivan);

//        Iterator<Student> iterator = new StudentGroupIterator(studentGroup);


//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (Student student : studentGroup){
//            System.out.println(student);
//        }
//        ArrayList<Student> arrayList = new ArrayList<>(List.of(dmitriy, alexander,alexey,ivan));
//        System.out.println(arrayList);
//        Collections.sort(arrayList,(s1,s2) -> s1.id-s2.id);
//        System.out.println(arrayList);
    }
}
