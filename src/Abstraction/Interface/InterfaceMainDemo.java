package Abstraction.Interface;



interface InterfaceA{

    void doSomething();

}

interface InterfaceB
{
    void doSomething();

}



class MainClass implements InterfaceB,InterfaceA
{

    @Override
    public void doSomething() {

    }
}


public class InterfaceMainDemo  {

    public static void main(String[] args) {


        MainClass mainClass= new MainClass();
        mainClass.doSomething();



    }




}
