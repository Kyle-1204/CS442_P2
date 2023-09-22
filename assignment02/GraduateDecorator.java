/*
 * Created on Sep 21, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package assignment02;

public class GraduateDecorator extends StudentDecorator {
	public enum Program {Prog1, Prog2};
	private Program program;
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public GraduateDecorator(AbstractStudent s) {
		super(s);
	}
	
}
