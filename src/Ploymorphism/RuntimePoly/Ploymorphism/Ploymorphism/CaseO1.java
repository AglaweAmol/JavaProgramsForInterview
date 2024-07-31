package Ploymorphism.RuntimePoly.Ploymorphism.Ploymorphism;


class Parent {
    public void property() {
        System.out.println("Cash+land+Gold");
    }

    public void marry() {
        System.out.println("Amol");
    }
}

class Child extends Parent {
    public void marry() {
        System.out.println("Child AAA");
    }
}


public class CaseO1 {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.marry();
        Child c = new Child();
        c.marry();
        Parent p1 = new Child();
        p1.property();


    }
}
