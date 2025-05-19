package Inheritance;


interface Elephant {
    void eat();
}

interface Pet {
    void play();
}

class Mammal {
    void breathe() {
        System.out.println("The mammal breathes.");
    }
}

class Frog extends Mammal implements Elephant, Pet {
    public void eat() {
        System.out.println("The dog eats food.");
    }

    public void play() {
        System.out.println("The dog plays.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
    	Frog f = new Frog();
        f.eat();    
        f.play();   
        f.breathe(); 
    }
}

