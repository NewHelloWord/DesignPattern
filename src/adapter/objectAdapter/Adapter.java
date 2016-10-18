package adapter.objectAdapter;

import adapter.classAdapter.Adaptee;

public class Adapter{

    private Adaptee adaptee ;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    /**
     * 源类Adaptee有方法adapeeMethod
     * 因此适配器类直接委派即可
     */
    public void adapeeMethod(){
        this.adaptee.adapteeMethod();
    }

    /**
     * 源类Adaptee没有方法specificMethod
     * 因此由适配器类需要补充此方法
     */
    public void specificMethod(){
        // do something
    }
}
