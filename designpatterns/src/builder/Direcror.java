package builder;

public class Direcror {

    private Builder builder;

    public Direcror(Builder builder) {
        this.builder = builder;
    }

    public Computer createComputer(String cpu, String mainBoard, String ram) {
        builder.buildMainBoard(mainBoard);
        builder.buildCpu(cpu);
        builder.buildRam(ram);
        return builder.create();
    }
}
