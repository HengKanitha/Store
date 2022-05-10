package Stored;

public class Time extends Orders{
    String date;
    String time;
    Orders or_id;
    Product pro_id;
  Customer cus_id;

    public Time(String s, String time, Customer cus_id,Product pro_id,Orders orders) {
        this.date=s;
        this.time=time;
        this.or_id=orders;
        this.pro_id=pro_id;
        this.cus_id=cus_id;
    }

    @Override
    public String toString(){
        return "Customer{"+"\nCus_ID: "+cus_id.cus_id+"\nCus_name: "+cus_id.cus_name+"\n Cus_gender: "+cus_id.cus_gender+"\nAddress: "+cus_id.address+"\nPhone"+cus_id.phone+"\nPro_id: "+pro_id.pro_id
                +"\nPro_name:"+pro_id.pro_name+"\nQty: "+pro_id.qty+"\nPrice: "+pro_id.price+"\nTotal:"+pro_id.total
                + "\nOr_ID: "+or_id.or_price+"\nCus_id: "+or_id.cus_id+"\nPro_ID: "+or_id.pro_id+"\nOr_qty:"+or_id.or_qty+"\nOr_price:"+or_id.or_price+"\nPayment:"+or_id.payment+"\nDate: "+date+"\nTime: "+time+'}';
    }
}
