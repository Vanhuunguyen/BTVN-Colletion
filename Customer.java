package BTVN_Collection;

import java.util.ArrayList;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private ArrayList<Purchase> purList = new ArrayList<>();

    public Customer() {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.purList = purList;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Purchase> getPurList() {
        return purList;
    }

    public void setPurList(ArrayList<Purchase> purList) {
        this.purList = purList;
    }

    public void addPur(Purchase purchase){
    purList.add(purchase);
    }
}
