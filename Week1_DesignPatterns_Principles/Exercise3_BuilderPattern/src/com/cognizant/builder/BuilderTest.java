package com.cognizant.builder;

public class BuilderTest {

    public static void main(String[] args) {

        Computer gamingComputer = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam("16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4060")
                .build();

        gamingComputer.displayConfiguration();

        System.out.println();

        Computer officeComputer = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("512GB SSD")
                .build();

        officeComputer.displayConfiguration();
    }
}