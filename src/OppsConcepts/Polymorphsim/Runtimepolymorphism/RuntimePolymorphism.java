package OppsConcepts.Polymorphsim.Runtimepolymorphism;


class Mobile {

    void price() {
        System.out.println("Mobile price");
    }

}

class Samsung extends Mobile {

    @Override
    void price() {
        System.out.println("Samsung mobile price");
    }

}

class Iphone extends Mobile {

    void price() {
        System.out.println("Iphone mobile price");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {

        Mobile mySamsung = new Samsung();
        Mobile myIphone = new Iphone();

        mySamsung.price();
        myIphone.price();

    }

}
