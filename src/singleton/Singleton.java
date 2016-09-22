package singleton;

/**
 * Created by yaoliao on 2016/9/21.
 */
public class Singleton {

//    //  1、lazy initialization, thread-unsafety（懒汉法，线程不安全）
//    //利用一个静态变量来记录Singleton类的唯一实例
//    private static Singleton instance = null;
//
//    //将无参的构造方法设置为private，是为了避免类在外部被实例（new Singleton()）
//    private Singleton(){};
//
//    //通过getInstance方法来实例化对象，并返回这个实例
//    public static Singleton getInstance(){
//        if(instance == null ){
//            instance = new Singleton();
//        }
//        return instance;
//    }


//    //  2、lazy initialization, thread-safety(懒汉法，线程安全)
//    private static Singleton instance = null;
//
//    private Singleton(){};
//
//    public static synchronized Singleton getInstance(){
//        if(instance == null ){
//            instance = new Singleton();
//        }
//        return instance;
//    }


//    //  3、double-checked locking（双重检查加锁）
//    private volatile static Singleton instance = null;
//    private Singleton(){}
//    public static Singleton getInstance() {
//        if (instance == null){
//            synchronized (Singleton.class){
//                if (instance == null){
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }


//    //  4、eager initialization thread-safety （饿汉法，线程安全）
//    private static Singleton instance = new Singleton();
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        return instance;
//    }



    //  5、static inner class thread-safety （静态内部类，线程安全）
    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }
    private Singleton(){}

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

}
