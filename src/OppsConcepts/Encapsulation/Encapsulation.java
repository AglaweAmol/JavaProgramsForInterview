package OppsConcepts.Encapsulation;

public class Encapsulation {

    private String mobileName;

    private int price;


    public String getName()
    {
        return mobileName;
    }

    public int getPrice() {
        return price;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public void setPrice(int price) {
        this.price = price;

        if (price > 10000)
        {
            this.price=price;
        }
        else {
            System.out.println("Mobile is less than 10k");
        }
    }

    public static void main(String[] args) {

        Encapsulation encapsulation=new Encapsulation();

        encapsulation.setMobileName("iphone");
        encapsulation.setPrice(10000);

        System.out.println("Mobile Name: "+encapsulation.getName());
        System.out.println("Mobile Price="+encapsulation.getPrice());


        encapsulation.setPrice(-12020);


    }


}
