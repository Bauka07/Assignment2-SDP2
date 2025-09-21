package org.example;

public class SamsungFactory implements PhoneFactory{
    public Call createCall() {
        return new SamsungCall();
    }
    public Camera createCamera() {
        return new SamsungCamera();
    }
}
