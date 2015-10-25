package miniGuice.coupledPerson;

import miniGuice.DetailInfo;
import miniGuice.Laptop;
import miniGuice.Mobile;

public class CClient {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        Laptop laptop = new Laptop();
        DetailInfo detailInfo = new DetailInfo();
        CPerson coupledPeson = new CPerson(mobile, laptop, detailInfo);

        coupledPeson.diplayInfo();
    }
}
