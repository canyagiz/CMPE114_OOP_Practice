// Car Class implementing RentalItem
package Question1;

class Car implements RentalItem {
    private String brand;
    private String model;
    private int seatingCapacity;
    private boolean available;

    public Car(String brand, String model, int seatingCapacity, boolean available) {
        this.brand = brand;
        this.model = model;
        this.seatingCapacity = seatingCapacity;
        this.available = available;
    }

    @Override
    public String getItemDetails() {
        return "Car: Brand: " + brand + " - Model: " + model + " - Seating Capacity: " 
                + seatingCapacity + " - Available: " + isAvailable();
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}