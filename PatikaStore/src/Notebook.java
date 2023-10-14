public class Notebook extends Product {
    private int storage;
    public Notebook(int ID, int price, int stockQuantity, String name, String brand, int ram, float screenSize, int storage) {
        super(ID, price, stockQuantity, name, brand, ram, screenSize);
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}