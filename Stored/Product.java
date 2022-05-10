package Stored;

public class Product extends Customer{
    int pro_id;
    String pro_name;
    int qty;
    int price;
   public int total;

     public Product(int pro_id, String pro_name, int qty, int price){
         this.pro_id=pro_id;
         this.pro_name=pro_name;
         this.qty=qty;
         this.price=price;
         this.total =qty*price;

     }


    public Product() {
    }

    public Product(int i, String cocola, int i1, double v, Orders orders) {
    }
}
