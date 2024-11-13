package pl.example.vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mojtest {

    @Test
    public void testCarMaxSpeed() {
        Car car = new Car("Sedan", 4);
        assertEquals(200, car.getMaxSpeed(), "Max speed of Car should be 200");
    }

    @Test
    public void testBikeMaxSpeed() {
        Bike bike = new Bike("Mountain Bike");
        assertEquals(50, bike.getMaxSpeed(), "Max speed of Bike should be 50");
    }

    @Test
    public void testCarDoors() {
        Car car = new Car("Sedan", 4);
        assertEquals(4, car.getDoors(), "Car should have 4 doors");
    }

    @Test
    public void testCarName() {
        Car car = new Car("Sedan", 4);
        assertEquals("Sedan", car.getName(), "Car name should be 'Sedan'");
    }

    @Test
    public void testBikeName() {
        Bike bike = new Bike("Mountain Bike");
        assertEquals("Mountain Bike", bike.getName(), "Bike name should be 'Mountain Bike'");
    }
}
