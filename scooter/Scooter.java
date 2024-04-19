package homeworks.hw1.scooter;

import java.util.Random;

// A class representing a scooter.
public class Scooter {

    // Unique identifier for the scooter.
    int id;

    // Model name of the scooter (e.g., Sparrow X10).
    String model;

    // Current battery level (percentage).
    int batteryLevel;

    // Scooter location.
    double x, y;

    // Indicates if the scooter is available.
    boolean available;

    // Get method for retrieving the scooter's ID.
    public int getId() {
        return id;
    }

    // Set method for updating the scooter's ID.
    public void setId(int id) {
        this.id = id;
    }

    // Get method for retrieving the scooter's model.
    public String getModel() {
        return model;
    }

    // Set method for updating the scooter's model.
    public void setModel(String model) {
        this.model = model;
    }

    // Get method for retrieving the scooter's battery level.
    public int getBatteryLevel() {
        return batteryLevel;
    }

    // Set method for updating the scooter's battery level.
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    // Get method for retrieving the scooter's x-coordinate.
    public double getX() {
        return x;
    }

    // Set method for updating the scooter's x-coordinate.
    public void setX(double x) {
        this.x = x;
    }

    // Get method for retrieving the scooter's y-coordinate.
    public double getY() {
        return y;
    }

    // Set method for updating the scooter's y-coordinate.
    public void setY(double y) {
        this.y = y;
    }

    // Get method for checking if the scooter is available.
    public boolean isAvailable() {
        return available;
    }

    // Set method for updating the availability status of the scooter.
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method for traveling to a specified location and updating battery level.
    public void travelTo(double x, double y) {
        this.x = x;
        this.y = y;
        this.batteryLevel -= new Random().nextInt(15); // Consume some battery.
    }

    // Method to represent the scooter as a string.
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scooter{");
        sb.append("id=").append(id);
        sb.append(", model='").append(model).append('\'');
        sb.append(", batteryLevel=").append(batteryLevel);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }
}
