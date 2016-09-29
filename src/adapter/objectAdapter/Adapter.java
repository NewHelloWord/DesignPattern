package adapter.objectAdapter;

import adapter.classAdapter.Adapee;

public class Adapter{

    private Adapter adapter ;

    public Adapter(Adapter adapter){
        this.adapter = adapter;
    }

    /**
     * 源类Adaptee有方法adapeeMethod
     * 因此适配器类直接委派即可
     */
    public void adapeeMethod(){
        this.adapter.adapeeMethod();
    }

    /**
     * 源类Adaptee没有方法specificMethod
     * 因此由适配器类需要补充此方法
     */
    public void specificMethod(){
        // do something
    }
}
