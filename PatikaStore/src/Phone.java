public class Phone extends Product {
    private int phoneMemory;
    private float battery;
    private String color;
    private int cameraQuality;
    public Phone(int ID, int price, int stockQuantity, String name, String brand, int ram, float screenSize, int phoneMemory, float battery, String color, int cameraQuality) {
        super(ID, price, stockQuantity, name, brand, ram, screenSize);
        this.phoneMemory = phoneMemory;
        this.battery = battery;
        this.color = color;
        this.cameraQuality = cameraQuality;
    }

    public int getPhoneMemory() {
        return phoneMemory;
    }

    public void setPhoneMemory(int phoneMemory) {
        this.phoneMemory = phoneMemory;
    }

    public float getBattery() {
        return battery;
    }

    public void setBattery(float battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCameraQuality() {
        return cameraQuality;
    }

    public void setCameraQuality(int cameraQuality) {
        this.cameraQuality = cameraQuality;
    }
}

