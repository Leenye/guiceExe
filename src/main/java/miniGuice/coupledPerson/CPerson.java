package miniGuice.coupledPerson;

import miniGuice.DetailInfo;
import miniGuice.Laptop;
import miniGuice.Mobile;

public class CPerson {
    private Mobile mobile;
    private Laptop laptop;
    private DetailInfo detailInfo;

    public CPerson(Mobile mobile, Laptop laptop, DetailInfo detailInfo){
        this.mobile = mobile;
        this.laptop = laptop;
        this.detailInfo = detailInfo;
    }

    public void diplayInfo(){
        System.out.println("Mobile:" + mobile);
        System.out.println("Laptop:" + laptop);
    }
}
