package Enumeration;


enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int severity;

    Level(int severity) {
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }
}

public class LevelTest {
	
    public static void main(String[] args) {
        Level level = Level.HIGH;
        System.out.println("Level: " + level);
        System.out.println("Severity: " + level.getSeverity());
    }
}
