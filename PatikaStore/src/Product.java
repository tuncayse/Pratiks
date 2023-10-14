public abstract class Product {
    private int ID;
    private int price;
    private int stockQuantity;
    private String name;
    private String brand;
    private int ram;
    private float screenSize;

    public Product(int ID, int price, int stockQuantity, String name, String brand, int ram, float screenSize) {
        this.ID = ID;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.name = name;
        this.brand = brand;
        this.ram = ram;
        this.screenSize = screenSize;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }
}
