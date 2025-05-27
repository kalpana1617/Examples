package NesteadClass;

public class NesteadNonStatic {
    class Inner {
        void display() {
            System.out.println("Inside non-static inner class");
        }
    }

    public static void main(String[] args) {
    	NesteadNonStatic outer = new NesteadNonStatic();
    	NesteadNonStatic.Inner inner = outer.new Inner();
        inner.display();
    }
}

