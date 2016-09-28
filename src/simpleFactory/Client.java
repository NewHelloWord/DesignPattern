package simpleFactory;

public class Client {

    public static void main(String[] args){
        Pizza cheese = SimplePizzaFactory.factory("cheese");
        Pizza clam = SimplePizzaFactory.factory("clam");

        cheese.box();
        clam.cut();
    }

}
