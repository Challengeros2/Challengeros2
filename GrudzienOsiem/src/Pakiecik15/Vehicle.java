package Pakiecik15;

public class Vehicle implements Comparable<Vehicle> {
    private String model;
    private int speed;

    public Vehicle(String name, int age) {
        this.model = model;
        this.speed = speed;
    }

    public String getName() {
        return model;
    }

    public int getAge() {
        return speed;
    }

    public void setName(String name) {
        this.model = model;
    }

    public void setAge(int age) {
        this.speed = speed;
    }

    @Override
    public int compareTo(Vehicle other){
        return Integer.compare(this.speed, other.speed);
    }
}
