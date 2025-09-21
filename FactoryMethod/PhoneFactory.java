package org.example;
//Here Factory
class PhoneFactory {
    public Phone getPhone(String type) {
        if(type.equalsIgnoreCase("Iphone")){
            return new Iphone();
        } else if (type.equalsIgnoreCase("Samsung")){
            return new Samsung();
        } else {
            return null;
        }
    }
}
