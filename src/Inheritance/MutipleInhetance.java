package Inheritance;


interface Cricket {
	default void play() {
	}
}

interface Match {
	default void score() {		
	}
}
class Player implements Cricket, Match {
	public void play() {
		System.out.println("play");
	}
	
	public void score() {
	System.out.println("score");	
	}
	
}
public class MutipleInhetance {
	public static void main(String[] args) {
		Player p = new Player();
		p.play();
		p.score();
	}

}
