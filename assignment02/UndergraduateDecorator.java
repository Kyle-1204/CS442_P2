package assignment02;

public class UndergraduateDecorator extends StudentDecorator {
	public enum Level {LEVEL1, LEVEL2, LEVEL3, LEVEL4};  
	Level level;
	public UndergraduateDecorator(AbstractStudent s) {
		super(s);
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}

}
