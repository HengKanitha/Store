package Stored;

public class Orders extends Product{
    int or_id;
    int cus_id;
    int or_qty;
    float or_price;
    float payment;
    public Orders(int or_id, int cus_id, int or_qty,float or_price){

        this.or_id = or_id;
        this.cus_id=cus_id;
        this.or_qty=or_qty;
        this.or_price=or_price;
        this.payment=or_qty*or_price;
    }


    public Orders() {
    }
}
