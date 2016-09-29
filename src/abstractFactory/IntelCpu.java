package abstractFactory;

public class IntelCpu implements Cpu {
    @Override
    public void model() {
        System.out.println("this is IntelCpu");
    }
}
