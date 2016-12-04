package proxy.dynamicProxy;

/**
 * Created by JerryMouse on 2016/12/4.
 */
public class Client {
    public static void main(String[] args){
        TestInterface ti = new TestClass();
        DynamicProxy dp = new DynamicProxy();
        TestInterface t = (TestInterface) dp.newInstance(ti);
        t.Sing();
    }
}
