package guiceCar;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CarTest extends TestCase {
    private Car car;
    private Wheel wheel;
    private Engine engine;

    @Before
    public void setUp(){
        wheel = new Wheel();
        engine = new Engine();
        car = new Car(wheel, engine);

    }

    @Test
    public void testGetInfo() throws Exception {
        assertThat(car.getInfo(),is("[wheel: num 4,materail rubber and matel][Engine: power 100.0kw, displacement 1.8]"));
    }
}