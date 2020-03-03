package simplefactory;

public class ComputerFactory {

    public static Computer createComputer(String type) {
        Computer computer = null;
        switch (type) {
            case "Lenovo":
                computer = new LenovoComputer();
                break;
            case "Hp":
                computer = new HpComputer();
                break;
            case "Asus":
                computer = new AsusComputer();
                break;
        }
        return computer;
    }
}
