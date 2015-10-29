package guiceCar;


public class WheelFactory {
    private static Wheel mockWheelImp;
    public static Wheel getInstance(){
        if(mockWheelImp != null) {
            return mockWheelImp;
        }
        return new WheelImp();
    }

    public static void setMockWheelImp(Wheel wheelImp) {
        mockWheelImp = wheelImp;
    }
}
