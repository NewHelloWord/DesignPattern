package simpleFactory;

public class SimplePizzaFactory {
    
    public static Pizza factory(String type){
        Pizza pizza = null;
        if (type == null) {
            return pizza;
        }else if (type.equals("cheese")){
            return new CheesePizza();
        }else if (type.equals("clam")){
            return new ClamPizza();
        }else {
            return pizza;
        }
    }
}
