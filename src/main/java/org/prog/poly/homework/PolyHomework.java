package org.prog.poly.homework;

//TODO: Add interface IPhone
//TODO: Add interface method for call
//TODO: Add interface method for unlock
//TODO: Add class for Androind and iOS phones that implement IPhone

public class PolyHomework {

    public static void main(String[] args) {
        //TODO: create Android and IOS phones, and call usePhone() for both
        Android14 android14=new Android14();
        IpHone15 ipHone15=new IpHone15();
        callPhone(android14);
        callPhone(ipHone15);
    }

    public static void callPhone(Iphone iphone
            //IPhone iPhone
    ) {
        iphone.unlock();
        iphone.call();
    }
}
