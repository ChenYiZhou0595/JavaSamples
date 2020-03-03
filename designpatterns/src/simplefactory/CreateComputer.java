package simplefactory;

public class CreateComputer {

    public static void main(String[] args) {
        Computer hpComputer = ComputerFactory.createComputer("Hp");
        hpComputer.start();
    }
}
