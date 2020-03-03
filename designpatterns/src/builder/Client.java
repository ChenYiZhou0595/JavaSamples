package builder;

public class Client {

    public static void main(String[] args) {
        Builder builder  = new MoonComputerBuilder();
        Direcror direcror = new Direcror(builder);
        direcror.createComputer("i7-6700", "华擎玩家至尊", "三星DDR4");
    }
}
