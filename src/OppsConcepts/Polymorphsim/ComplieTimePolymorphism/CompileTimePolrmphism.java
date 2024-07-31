package OppsConcepts.Polymorphsim.ComplieTimePolymorphism;


class Mobile {

    String color(String color) {
        return color;
    }

    String color(String color, int price) {
        return color + " " + price;
    }

}

public class CompileTimePolrmphism {

    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        System.out.println(mobile.color("Black"));
        System.out.println(mobile.color("White", 1000));


    }
}
