package BTVN_Collection;

import java.util.Objects;

public class Product {
    private int ProductID;
    private String name;
    private String category;

    public Product() {
    }
    public Product(int productID, String name, String category) {
        ProductID = productID;
        this.name = name;
        this.category = category;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductID=" + ProductID +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(getProductID(), product.ProductID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ProductID, name, category);
    }
}
