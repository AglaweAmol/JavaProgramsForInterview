package Ploymorphism.Ploymorphism.CompileTimePolymor;



class Animal
{

}
class Monkey extends Animal
{

}

public class Case3 {

    public void methodOne(Animal a)
    {
        System.out.println("Animal version");
    }

    public void methodOne(Monkey m)
    {
        System.out.println("Monkey version");
    }
    public static void main(String[] args) {

        Case3 case3=new Case3();
        Animal a=new Animal();
        case3.methodOne(a);
        Monkey m=new Monkey();
        case3.methodOne(m);

        Animal a1=new Monkey();
        case3.methodOne(a1);

    }

}
