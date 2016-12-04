package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by JerryMouse on 2016/12/4.
 */
public class DynamicProxy implements InvocationHandler{

    private Object object;

    public Object newInstance(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before sing......... ");
        Object ob = method.invoke(object,args);
        System.out.println("after sing.......... ");
        return ob;
    }
}
