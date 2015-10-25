package guiceCar;


public class Client {

    public static void main(String args[]){

        Car car = CarFactory.getInstance();
        car.displayInfo();
    }
}
