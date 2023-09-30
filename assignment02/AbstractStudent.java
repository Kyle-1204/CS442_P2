package assignment02;

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

	public String getCourses(){
		return ""; // getCourses should return ""
	}

	// getCourseList() should return new ArrayList<>()
	
	// The other getter methods copied from the other decorators 
	// should print "Method not implemented"
	// and return ""
	
	// the setter methods copied from the other decorators 
	// should print "Method not implemented".
	// There is no return since the setters are void

	// methods of a ConcreteStudent:
	abstract public String getUniversity();
	abstract public void setUniversity(String university);
}
