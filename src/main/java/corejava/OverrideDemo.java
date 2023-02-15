package corejava;

abstract class Animal {
    public abstract void m1();
}

class Dog extends Animal {
    public void m1() {
        System.out.println("m1 method from Dog class");
    }
}

public class OverrideDemo extends Dog {

    public void m1() {
        super.m1();
        System.out.println("m1 method from OverrideDemo");
    }

    public static void main(String[] args) {
        Dog dog = new OverrideDemo();
        dog.m1();
    }
}
