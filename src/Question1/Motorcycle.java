// Motorcycle Class implementing RentalItem
package Question1;

class Motorcycle implements RentalItem {
    private String brand;
    private String engineSize;
    private boolean available;

    public Motorcycle(String brand, String engineSize, boolean available) {
        this.brand = brand;
        this.engineSize = engineSize;
        this.available = available;
    }

    @Override
    public String getItemDetails() {
        return "Motorcycle: Brand: " + brand + " - Engine Size: " + engineSize 
                + " - Available: " + isAvailable();
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}