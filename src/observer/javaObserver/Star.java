package observer.javaObserver;

import java.util.Observable;

/**
 * Created by Yao on 2016/9/23.
 */
public class Star extends Observable {

    private String name;

    public Star(String name){
        this.name = name;
    }

    public void inTrouble(String troubleName){
        System.out.println(this.getName()+"："+troubleName);
        setChanged();
        notifyObservers(troubleName);
    }

    public String getName() {
        return name;
    }
}
