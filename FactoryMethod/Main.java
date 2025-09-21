package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();

        Phone iphone = factory.getPhone("Iphone");
        iphone.call();
        iphone.takePhoto();
        iphone.play();

        Phone samsung = factory.getPhone("Samsung");
        samsung.call();
        samsung.takePhoto();
        samsung.play();
    }
}