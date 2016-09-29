package abstractFactory;

public class AmdComputer implements ComputerFactory{
    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public Board cerateBoard() {
        return new AmdBoard();
    }
}
