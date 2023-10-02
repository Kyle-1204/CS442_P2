package assignment02;

import java.util.List;

public abstract class StudentDecorator extends AbstractStudent { //This is akin to our CondimentDecorator
	protected AbstractStudent delegate;
	public StudentDecorator(AbstractStudent s) {
		super(s.getInnerSelf());
		delegate = s;
	}
	public Person getInnerSelf() {
		return delegate.getInnerSelf();
	}
	public String getMajor() {
		return delegate.getMajor();
	}
	public String getUniversity() {
		return delegate.getUniversity();
	}

	/*Additions*/
	public UndergraduateDecorator.Level getLevel() {
		return delegate.getLevel();
	}
	public void setLevel(UndergraduateDecorator.Level level) {
		delegate.setLevel(level);
	} /*UnderGrad Getter/Setters ^*/

	public GraduateDecorator.Program getProgram() {
		return delegate.getProgram();
	}
	public void setProgram(GraduateDecorator.Program prog) {
		delegate.setProgram(prog);
	} /*Grad Getter/Setters ^*/

	public String getCountyOfResidence(){
		return delegate.getCountyOfResidence();
	}
	public void setCountyOfResidence(String county){
		delegate.setCountyOfResidence(county);
	} /*Domestic Getter/Setters ^*/

	public String getVisa(){
		return delegate.getVisa();
	}
	public void setVisa(String visa){
		delegate.setVisa(visa);
	} /*International Getter/Setters ^*/


	public String getCourses(){
		return delegate.getCourses();
	}

	public List<String> getCourseList() {
		return delegate.getCourseList(); 
	}
	public void setGrade(String courseRubricIn, String courseNumberIn, String sectionIn, String gradeIn){
		delegate.setGrade(courseRubricIn, courseNumberIn, sectionIn, gradeIn);
	}
	/*End~~*/
	public int hashCode() {
		return delegate.hashCode();
	}
	public void setMajor(String major) {
		delegate.setMajor(major);
	}
	public void setUniversity(String university) {
		delegate.setUniversity(university);
	}


}
