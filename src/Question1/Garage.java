// VehicleRental Class
package Question1;

class Garage {
    private static int totalCars = 0;
    private static int totalMotorcycles = 0;

    private RentalItem[] cars;         // Array for cars
    private RentalItem[] motorcycles;  // Array for motorcycles
    private int carCount = 0;
    private int motorcycleCount = 0;

    public Garage(int carCapacity, int motorcycleCapacity) {
        cars = new RentalItem[carCapacity];
        motorcycles = new RentalItem[motorcycleCapacity];
    }

    // Method to add a vehicle (Car or Motorcycle)
    public void addItem(RentalItem item) {
        if (item instanceof Car && carCount < cars.length) {
            cars[carCount++] = item;
            totalCars++;
        } else if (item instanceof Motorcycle && motorcycleCount < motorcycles.length) {
            motorcycles[motorcycleCount++] = item;
            totalMotorcycles++;
        } else {
        	if (item instanceof Car) {
                System.out.println("Cannot add more vehicles of Car type.");
        	}
        	else if(item instanceof Motorcycle) {
                System.out.println("Cannot add more vehicles of Motorcycle type.");
        	}
        }
    }

    // Method to list all vehicles
    public void listItems() {
        System.out.println("List of Cars:");
        for (int i = 0; i < carCount; i++) {
            System.out.println(cars[i].getItemDetails());
        }

        System.out.println("\nList of Motorcycles:");
        for (int i = 0; i < motorcycleCount; i++) {
            System.out.println(motorcycles[i].getItemDetails());
        }

        System.out.println("\nTotal Cars: " + totalCars);
        System.out.println("Total Motorcycles: " + totalMotorcycles);
    }
}