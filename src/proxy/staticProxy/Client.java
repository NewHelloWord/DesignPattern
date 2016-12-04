package proxy.staticProxy;

/**
 * Created by JerryMouse on 2016/12/4.
 */
public class Client {
    public static void main(String[] args){
        AbstractObject ao = new RealObject();
        ProxyObject po = new ProxyObject(ao);
        po.operation();
    }
}
