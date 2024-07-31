package ISARelationsShip;


class Pararent {
    public void methodOne() {
        System.out.println("Parent method");
    }
}

class Child extends Pararent {
    public void methodTwo() {
        System.out.println("Child Method");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Pararent p = new Pararent();
        p.methodOne();
// p.methodTwo();


        Child c = new Child();
        c.methodOne();
        c.methodTwo();

        Pararent p2 = new Child();
        p2.methodOne();
// p2.methodTwo();


//Child c1=new Pararent();


    }
}
