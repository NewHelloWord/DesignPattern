package prototype;

import java.io.Serializable;

/**
 * Created by JerryMouse on 2016/11/28.
 */
public class Book implements Serializable{

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
