public class Basket{
    private Product[] products;
    public Basket(Product[] products){
        this.products=products;
    }
    public void setProducts(Product[] products1){
        products=products1;
    }

    public Product[] getProducts(){
        return products;
    }
}
