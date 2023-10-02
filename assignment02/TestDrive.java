package assignment02;

import java.util.List; //Added

public class TestDrive {
    public static void main(String args[]){
        System.out.println("Testing....\n");

        Person x = new Person("Anthony", "12/27/01");
        AbstractStudent Ant = new ConcreteStudent(x);

        System.out.println("Testing default methods");
        Ant.getLevel();
        Ant.getProgram();
        Ant.getCountyOfResidence();
        Ant.getVisa();
        System.out.println();

        System.out.println("Printing Chaining...");
        System.out.println(Ant.getCourses()); // Should be "" or "NULL"
        System.out.println("End Chaining...");
        System.out.println("Printing List...");
        List<String> myList = Ant.getCourseList();
        for(String word : myList){
            System.out.println(word);
        }
        System.out.println("End List... TEST 0\n");

        //First Decorator
        Ant = new CourseDecorator(Ant, "CS", "350", "OS", 4, "01", "A-");
        System.out.println("Printing Chaining...");
        System.out.println(Ant.getCourses()); // Should be above ^^
        System.out.println("End Chaining...");
        System.out.println("Printing List...");

        //Testing setGrade 
        Ant.setGrade("CS", "350", "01", "C+"); //changes grade
        Ant.setGrade("CS", "375", "02", "A+"); //passes method to delegate
        myList = Ant.getCourseList();
        for(String word : myList){
            System.out.println(word);
        }
        System.out.println("End List... TEST 1\n");
                

        //Second
        Ant = new CourseDecorator(Ant, "CS", "375", "Algs", 4, "02", "B-");
        System.out.println("Printing Chaining...");
        System.out.println(Ant.getCourses()); // Should be above CS 350 and CS 375 now
        System.out.println("End Chaining...");
        System.out.println("Printing List...");
        myList = Ant.getCourseList();
        for(String word : myList){
            System.out.println(word);
        }
        System.out.println("End List...TEST 2\n");
               

        //Third
        Ant = new CourseDecorator(Ant, "MATH", "330", "NUMSYS", 4, "01", "C-");
		System.out.println("Printing Chaining...");
        System.out.println(Ant.getCourses());
        System.out.println("End Chaining...");		
        System.out.println("Printing List...");
        myList = Ant.getCourseList();
        for(String word : myList){
            System.out.println(word);
        }
         System.out.println("End List...TEST 3\n");
    }
}
