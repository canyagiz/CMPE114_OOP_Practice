// Main Class
package Question1;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create VehicleRental object with fixed capacities
        Garage garage = new Garage(2, 5);

        // Add 2 Cars
        garage.addItem(new Car("Toyota", "Corolla", 5, true));
        garage.addItem(new Car("Honda", "Civic", 5, true));

        
        // Add 2 Motorcycles
        garage.addItem(new Motorcycle("Yamaha", "600cc", true));
        garage.addItem(new Motorcycle("Kawasaki", "650cc", false));

        // Display all vehicles
        garage.listItems();
    }
}