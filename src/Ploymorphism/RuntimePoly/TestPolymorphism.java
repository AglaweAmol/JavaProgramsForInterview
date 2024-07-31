package Ploymorphism.RuntimePoly;


class Bank {
    float getRateOfInteres() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInteres() {
        return 7.2f;
    }
}

class AXIS extends Bank {
    float getRateOfInteres() {
        return 9.2f;
    }
}

class KOTAK extends Bank {
    float getRateOfInteres() {
        return 10.9f;
    }
}


public class TestPolymorphism {

    public static void main(String[] args) {

        Bank b;

        b = new AXIS();
        System.out.println("Axis Bank Rate Of Interest" + b.getRateOfInteres());

        b = new ICICI();
        System.out.println("ICICI Bank rate of Interest" + b.getRateOfInteres());

        b = new KOTAK();
        System.out.println("Kotak bank rate of interest" + b.getRateOfInteres());

    }
}
