package Stored;

public class Product extends Customer{
    int pro_id;
    String pro_name;
    int qty;
    float price;
     public Product(int pro_id, String pro_name, int qty, float price){
         this.pro_id=pro_id;
         this.pro_name=pro_name;
         this.qty=qty;
         this.price=price;
     }


    public Product() {
    }
}
