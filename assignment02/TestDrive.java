package assignment02;

public class TestDrive {
    public static void main(String args[]){
        System.out.println("Testing....");

        Person x = new Person("Anthony", "12/27/01");
        AbstractStudent Ant = new ConcreteStudent(x);

        System.out.println(Ant.getCourses()); // Should be "" or "NULL"

        Ant = new CourseDecorator(Ant, "CS", "350", "OS", 4, "01", "A-");
        System.out.println(Ant.getCourses()); // Should be above ^^

        Ant = new CourseDecorator(Ant, "CS", "375", "Algs", 4, "02", "B-");
        System.out.println(Ant.getCourses()); // Should be above CS 350 and CS 375 now

        Ant = new CourseDecorator(Ant, "MATH", "330", "NUMSYS", 4, "01", "C-");
		System.out.println(Ant.getCourses());		
    }
}
