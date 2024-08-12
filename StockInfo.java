package BTVN_Collection;

import java.util.Objects;

public class StockInfo {
    private int quantity;
    private double price;

    public StockInfo(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public StockInfo() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "StockInfo{" +
                "quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
