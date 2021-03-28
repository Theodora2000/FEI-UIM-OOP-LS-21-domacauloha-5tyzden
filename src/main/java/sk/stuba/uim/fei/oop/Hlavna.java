package sk.stuba.uim.fei.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hlavna {
    public static void main(String [] args){

        ArrayList<Student> studenti = new ArrayList<Student>();
        studenti.add(0,new Student(1,"Lejla", "M", 19));
        studenti.add(1,new Student(1,"Karla", "M", 19));
        studenti.add(2,new Student(1,"Zuzana", "M", 19));
        studenti.add(3,new Student(1,"Ana", "M", 19));
        studenti.add(4,new Student(1,"Rosa", "M", 19));

        Comparator sortingByName = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }

            public int compare(Student s1, Student s2) {
                return s1.getMeno().compareTo(s2.getMeno());
            }
        };

        studenti.forEach((s)->System.out.println(s));
        System.out.println("---------------------------");

        studenti.sort((Student s1, Student s2)->s1.getMeno().compareTo(s2.getMeno()));
        System.out.println("---------------------------");
        studenti.forEach((s)->System.out.println(s));

    }


}

