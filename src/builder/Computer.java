package builder;

public class Computer {
    private String CPU;
    private String RAM;
    private String DISK;

    public Computer(String CPU, String RAM, String DISK) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.DISK = builder.DISK;
    }

    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String DISK = "1TB";

        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public ComputerBuilder setDisk(String DISK) {
            this.DISK = DISK;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
