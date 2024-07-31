package OppsConcepts.Abstraction;


abstract class Mobile {

    abstract String mobileColor();
}

class Samsung extends Mobile {
    String color;

    public Samsung(String color) {
        this.color = color;
    }

    @Override
    String mobileColor() {
        return "Samsung with Black Color";
    }
}


class Iphone extends Mobile {

    String color;

    public Iphone(String color) {
        this.color = color;
    }

    @Override
    String mobileColor() {
        return "Iphone with Black Color";
    }
}

public class Abstarction {

    public static void main(String[] args) {

        Mobile samsung = new Samsung("Black color with additional");
        Mobile iphone = new Iphone("black color with additional feature of Iphone");

        System.out.println("Samsung mobile  " + samsung.mobileColor());
        System.out.println("Iphone Mobile  " + iphone.mobileColor());


    }
}
