package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // it is a iphone factory
        PhoneFactory iphoneFactory = new IphoneFactory();
        iphoneFactory.createCall().makeCall();
        iphoneFactory.createCamera().takePhoto();

        System.out.println("------------------------");

        PhoneFactory samsungFactory = new SamsungFactory();
        samsungFactory.createCall().makeCall();
        samsungFactory.createCamera().takePhoto();
    }
}