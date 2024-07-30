package OppsConcepts.Inheritance;


class Mobile{

    void price()
    {
        System.out.println("Mobile price");
    }

}
class Samsung extends Mobile {

    @Override
    void price() {
        System.out.println("Samsung mobile price");
    }

}
public class Inheritance {
}
