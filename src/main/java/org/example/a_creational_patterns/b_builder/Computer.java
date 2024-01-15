package org.example.a_creational_patterns.b_builder;

public class Computer {
    ProcessorType processorType;
    HardDiskType hardDiskType;
    int ram;


    public Computer(ProcessorType processorType, HardDiskType hardDiskType, int ram) {
        this.processorType = processorType;
        this.hardDiskType = hardDiskType;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processorType=" + processorType +
                ", hardDiskType=" + hardDiskType +
                ", ram=" + ram +
                '}';
    }
}

