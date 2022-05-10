package Stored;

public class Main {
    public static void main(String[] args) {
        Time obj =new Time("10/5/2022","4",
                new Customer(1,"kanitha","femal","svayriag"," 097877666"),
                new Product(1,"coca",5,  4),
                new Orders(1,1,5,  5));
        System.out.println(obj.toString());

    }
}
