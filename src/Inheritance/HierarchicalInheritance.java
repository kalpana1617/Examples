package Inheritance;

class Fruit {
    void eat() {
        System.out.println("Eat");
    }
}

class Apple extends Fruit {
    void juice() {
        System.out.println("juice");
    }
}

class Mango extends Fruit {
    void sweet() {
        System.out.println("sweet");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
    	Apple apple = new Apple();
    	apple.eat();   
    	apple.juice(); 

    	Mango m = new Mango();
        m.eat();    
        m.sweet();
    }
}

