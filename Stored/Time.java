package Stored;

public class Time extends Orders{
    String date;
    String time;
    Orders or_id;
    Product pro_id;
  Customer cus_id;
    public Time(String date,String time,Product pro_id,Orders or_id,Customer cus_id){

    }
    public String toString(){
        return "Customer{"+"\nCus_ID: "+cus_id+"\nCus_name: "+cus_name+"\n Cus_gender: "+cus_gender+"\nAddress: "+address+"\nPhone"+phone+"Pro_id: "+pro_id
                +"\nPro_name"+pro_name+"\nQty: "+qty+"\nPrice: "+price
                + "\nOr_ID: "+or_id+"\nCus_id"+cus_id+"\nPro_ID: "+pro_id+"\nOr_qty"+or_id+"\nOr_pric"+or_price+"\nDate: "+date+"\nTime: "+time+'}';
    }
}
