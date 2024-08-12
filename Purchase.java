package BTVN_Collection;

import java.util.Date;

public class Purchase {
    private int purchaseId;
    private String productname;
    private double price;
    private Date date;

    public Purchase(int purchaseId, String productname, double price, Date date) {
        this.purchaseId = purchaseId;
        this.productname = productname;
        this.price = price;
        this.date = date;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseId=" + purchaseId +
                ", productname='" + productname + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
