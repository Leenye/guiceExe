package miniGuice.factoryPerson;

import miniGuice.DetailInfo;
import miniGuice.Laptop;
import miniGuice.Mobile;

public class FPersonFactory {

    public static FPerson getInstance(String name, int age){
        Mobile mobile = new Mobile();
        Laptop laptop = new Laptop();
        DetailInfo detailInfo = new DetailInfo(name, age);
        FPerson fPerson = new FPerson(mobile, laptop, detailInfo);
        return fPerson;
    }
}
