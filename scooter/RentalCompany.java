package homeworks.hw1.scooter;

import java.util.ArrayList;
import java.util.List;

// A class representing a rental company managing scooters.
public class RentalCompany {

    // Unique identifier counter for scooters.
    private int uid = 0;

    // List to store all the scooters managed by the rental company.
    List<Scooter> scooters = new ArrayList<>();

    // Method to retrieve a list of available scooters.
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        // Iterating through all scooters to find the available ones.
        for (Scooter scooter: scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    // Method to add a new scooter to the rental company's fleet.
    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    // Method to remove a scooter from the rental company's fleet by ID.
    public boolean removeScooter(int id) {
        boolean removed = false;
        // Iterating through all scooters to find the one with the specified ID.
        for (Scooter scooter: scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
