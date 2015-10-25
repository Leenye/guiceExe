package miniGuice.factoryPerson;

import miniGuice.Laptop;
import miniGuice.Mobile;
import miniGuice.coupledPerson.CPerson;

public class FClient {
    public static void main(String[] args) {
        FPerson fPerson = FPersonFactory.getInstance("lily",10);
        fPerson.diplayInfo();
    }
}
