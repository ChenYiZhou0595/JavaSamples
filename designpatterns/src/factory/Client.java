package factory;

public class Client {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new GDComputerFactory();
        AsusComputer asusComputer = computerFactory.createComputer(AsusComputer.class);
        asusComputer.start();
    }
}
