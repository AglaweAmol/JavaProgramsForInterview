package Ploymorphism.CompileTimePolymor;


public class CompileTimeDemo {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {


        CompileTimeDemo calc = new CompileTimeDemo();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(2.5, 3.5));


    }


}
