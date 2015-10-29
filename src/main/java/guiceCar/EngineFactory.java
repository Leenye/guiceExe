package guiceCar;

public class EngineFactory {
    public static EngineImp getInstance(){
        EngineImp engineImp = new EngineImp();
        return engineImp;
    }
}
