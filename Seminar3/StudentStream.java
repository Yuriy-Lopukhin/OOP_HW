package Seminar3;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;



class StudentStream implements Iterable<StudentGroup> {



    private int streamNumber;

    private List<StudentGroup> groups;



    public StudentStream(int streamNumber) {

        this.streamNumber = streamNumber;

        this.groups = new ArrayList<>();

    }




    public void addGroup(StudentGroup group) {

        this.groups.add(group);

    }




    public int getStreamNumber() {

        return streamNumber;

    }



    public List<StudentGroup> getGroups() {

        return groups;

    }




    public Iterator<StudentGroup> iterator() {

        return groups.iterator();

    }



}



class StudentGroup implements Comparable<StudentGroup> {



    private String name;

    private int numberOfStudents;


    public StudentGroup(String name, int numberOfStudents) {

        this.name = name;

        this.numberOfStudents = numberOfStudents;

    }


    public String getName() {

        return name;

    }


    public int getNumberOfStudents() {

        return numberOfStudents;

    }



    public int compareTo(StudentGroup otherGroup) {

        return Integer.compare(this.numberOfStudents, otherGroup.numberOfStudents);

    }


    

    public String toString() {

        return "Group " + name + " (" + numberOfStudents + " students)";

    }


}