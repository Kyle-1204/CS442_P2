package assignment02;

public class UndergraduateDecorator extends StudentDecorator {
	public static enum Level {LEVEL1, LEVEL2, LEVEL3, LEVEL4, NONE};  
	Level level;
	public UndergraduateDecorator(AbstractStudent s) {
		super(s);
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(UndergraduateDecorator.Level level) {
		this.level = level;
	}

}
