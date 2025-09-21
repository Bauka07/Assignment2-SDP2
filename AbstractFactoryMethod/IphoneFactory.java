package org.example;

public class IphoneFactory implements PhoneFactory{
    public Call createCall() {
        return new IphoneCall();
    }
    public Camera createCamera() {
        return new IphoneCamera();
    }
}

