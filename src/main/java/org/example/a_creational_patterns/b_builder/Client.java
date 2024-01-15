package org.example.a_creational_patterns.b_builder;

import org.example.util.CommonUtils;

public class Client {
    public static void main(String[] args) {

        Computer computer = ComputerBuilder.builder()
                .setRam(2)
                .setHardDiskType(HardDiskType.HDD)
                .build();

        CommonUtils.display(computer);
    }
}
