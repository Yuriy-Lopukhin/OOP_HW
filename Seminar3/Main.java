package Seminar3;

import java.util.Collections;

 
 public class Main {


    public static void main(String[] args) {

        StudentStream stream = new StudentStream(1);



        StudentGroup group1 = new StudentGroup("Group 1", 20);

        StudentGroup group2 = new StudentGroup("Group 2", 15);

        StudentGroup group3 = new StudentGroup("Group 3", 10);


        stream.addGroup(group1);

        stream.addGroup(group2);

        stream.addGroup(group3);

 
        for (StudentGroup group : stream) {

            System.out.println(group);

        }

        Collections.sort(stream.getGroups());

        for (StudentGroup group : stream) {

            System.out.println(group);

        }

    }


    
} 
