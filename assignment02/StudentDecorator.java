package assignment02;

public abstract class StudentDecorator extends AbstractStudent {
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
