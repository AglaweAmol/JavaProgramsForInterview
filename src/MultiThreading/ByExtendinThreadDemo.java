package MultiThreading;



class Mythread extends Thread{

    public void run()
    {
        System.out.println("Child Thread");
    }
}
public class ByExtendinThreadDemo {

    public static void main(String[] args) {

        Mythread t= new Mythread();
        t.start();

        System.out.println("Main Thread");

    }

}
