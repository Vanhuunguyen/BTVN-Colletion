package BTVN_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class QLKH {
    StockInfo stockInfo = new StockInfo();
    public Map<Product,StockInfo> quanLy = new HashMap<>();
    public void themProduct(Product product, StockInfo stockInfo){
        quanLy.put(product, stockInfo);
    }
    public void displayMap (){
        System.out.println(quanLy);
    }
    public void upDate(int ProductID, int newQuantity, double newPrice){
        for(Product product: quanLy.keySet()){
            if (product.getProductID()==(ProductID)){
            StockInfo stockInfo = quanLy.get(product);
            stockInfo.setPrice(newPrice);
            stockInfo.setQuantity(newQuantity);
            }else{
                System.out.println("doi tuong k ton tai");
        }
        }
    }
    public void search (int ProductID){
        for(Map.Entry<Product, StockInfo> entry : quanLy.entrySet()){
            if (entry.getKey().getProductID()== ProductID){
                System.out.println("doi tuong can tim la "+ entry.getKey());
                System.out.println("thong tin sp: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
    QLKH qlkh = new QLKH();
    Product product1 = new Product(01,"huu","adv");
    StockInfo stockInfo1 = new StockInfo(20,20.0);
    qlkh.themProduct(product1,stockInfo1);
    qlkh.displayMap();
    qlkh.upDate(02,5,15);
    qlkh.displayMap();
    }

}
