package Ploymorphism.Ploymorphism.CompileTimePolymor;


public class Case1 {

    public void methodOne(int i) {
        System.out.println("int-arg method");
    }

    public void methodOne(float f) {
        System.out.println("float-arg method");
    }

    public void methodOne(float f, int i) {
        System.out.println("float-arg and Int arg method");
    }

    public static void main(String[] args) {

        Case1 case1 = new Case1();
        case1.methodOne(10);
        case1.methodOne(10.0f);
        case1.methodOne(10.5f, 10);


    }
}
