package HomeWork6_2;

public class Solution {
    public static void main(String[] args) {
        Car car = new Car(null, 0);
        SportCar sportCar = new SportCar("Audi", 4, 500);

         BeanUtils.assign(car,sportCar);

        System.out.println(car.getName());
        System.out.println(car.getWheels());
    }
}

class Car {
    private String name;
    private int wheels;

    private String getEngineBluePrint() {
        return "Real BluePrint of the Car";
    }

    public Car(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}

class SportCar extends Car {
    private int enginePower;

    public SportCar(String name, int wheels, int enginePower) {
        super(name, wheels);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}