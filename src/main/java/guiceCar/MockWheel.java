package guiceCar;

public class MockWheel implements Wheel {
    private boolean used = false;

    @Override
    public String getWheel() {
        used = true;
        return "mocked wheel";
    }

    public boolean getUsed() {
        return used;
    }
}
