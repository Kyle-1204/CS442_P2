package assignment02;

import java.util.List; //Added
import java.util.ArrayList; //Added

abstract public class AbstractStudent { //The First Abstract
	private String major;
	private Person innerSelf;
	public AbstractStudent (Person p) {
		innerSelf = p;
	}
	public Person getInnerSelf() {
		return innerSelf;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	// List all the methods here that appear in all the given decorators, so that
	// all  the decorators and the ConcreteStudent have the same interface.

	public String getCourses(){ //Definetly right
		return ""; // getCourses should return ""
	}

	public List<String> getCourseList(){ //Probably right
		List<String> courseList = new ArrayList<>();
		return courseList; // getCourseList() should return new ArrayList<>()
	}	
	

	// The other getter methods copied from the other decorators 
	// should print "Method not implemented"
	// and return "" or NONE
	public UndergraduateDecorator.Level getLevel() {
		System.out.println("Method not implemented");
		return UndergraduateDecorator.Level.NONE;
	}
	public GraduateDecorator.Program getProgram() {
		System.out.println("Method not implemented");
		return GraduateDecorator.Program.NONE;
	}
	public String getCountyOfResidence(){
		System.out.println("Method not implemented");
		return "";
	}
	public String getVisa(){
		System.out.println("Method not implemented");
		return "";
	}
	// the setter methods copied from the other decorators 
	// should print "Method not implemented".
	// There is no return since the setters are void
	public void setGrade(String courseRubricIn, String courseNumberIn, String sectionIn, String gradeIn){
		System.out.println("Method not implemented"); //I dont know if this is right especially
	}

	public void setLevel(UndergraduateDecorator.Level level) {
		System.out.println("Method not implemented");
	}
	public void setProgram(GraduateDecorator.Program prog) {
		System.out.println("Method not implemented");
	} 
	public void setCountyOfResidence(String county) {
		System.out.println("Method not implemented");
	} 
	public void setVisa(String visa) {
		System.out.println("Method not implemented");
	} 
	// methods of a ConcreteStudent:
	abstract public String getUniversity();
	abstract public void setUniversity(String university);
}
