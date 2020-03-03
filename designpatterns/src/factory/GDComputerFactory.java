package factory;

public class GDComputerFactory extends ComputerFactory {

    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        Computer computer = null;
        String clzName = clz.getName();
        try {
            // 通过反射来生产不同厂家的计算机
            computer = (Computer) Class.forName(clzName).newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) computer;
    }
}
