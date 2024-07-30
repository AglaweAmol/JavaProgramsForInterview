package Ploymorphism.RuntimePoly;



class Bike
{
    void run()
    {
        System.out.println("running");
    }
}
class Splendor extends Bike
{
    void run()
    {
        System.out.println("running safely with 60KM");
    }
}


public class RuntimePolymorphism {

    public static void main(String[] args) {

        Bike b= new Splendor();
        b.run();
    }

}
