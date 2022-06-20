public class Product {
    private String name;
    private int price;
    private double rate;
    public Product(String name, int price, double rate){
        this.name=name;
        this.price=price;
        this.rate=rate;
    }
    public void setName(String name1){
        name=name1;
    }
    public void setPrice(int price1){
        price=price1;
    }
    public void setRate(double rate1){
        rate=rate1;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public double getRate(){
        return rate;
    }
}
