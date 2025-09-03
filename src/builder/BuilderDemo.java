package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Computer gaming = new Computer.ComputerBuilder("Intel I9", "64GB")
                .setDisk("1TB SSD")
                .build();

        Computer officePC = new Computer.ComputerBuilder("Intel I3", "32GB").build();

    }
}
