package org.example.creational_patterns.d_builder;

public class ComputerBuilder {
    ProcessorType processorType = ProcessorType.AMD;
    HardDiskType hardDiskType = HardDiskType.SSD;

    int ram;

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    public ComputerBuilder setProcessorType(ProcessorType processorType) {
        this.processorType = processorType;
        return this;
    }

    public ComputerBuilder setHardDiskType(HardDiskType hardDiskType) {
        this.hardDiskType = hardDiskType;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    Computer build() {
        return new Computer(processorType, hardDiskType, ram);
    }
}