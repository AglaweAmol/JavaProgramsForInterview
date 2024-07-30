package Ploymorphism.Ploymorphism.CompileTimePolymor;

public class Case2 {

    public void methodOne(String s)
    {
        System.out.println("String method");
    }

    public void methodOne(Object o)
    {
        System.out.println("Object method");
    }


    public static void main(String[] args) {

        Case2 case2=new Case2();
        case2.methodOne(new Object());
        case2.methodOne("Amol");
    }

}
