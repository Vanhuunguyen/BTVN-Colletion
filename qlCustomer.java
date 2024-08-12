package BTVN_Collection;

import java.util.HashSet;
import java.util.Set;

public class qlCustomer {
   Customer cus = new Customer();
    public Set<Customer> cusSet= new HashSet<>();
    public void addCus(Customer cus){
        cusSet.add(cus);
    }
    public Customer search (int ID){
        for (Customer cus :cusSet){
            if (ID== cus.getCustomerId()){
                return cus;
            }
            }
        return null;
    }
    public void display (String name){
        for (Customer cus:cusSet){
            if (name.equals(cus.getName())){
                System.out.println(cus.getPurList());
            }else {
                System.out.println("khach hang khong ton tai");
        }
        }
    }





}
