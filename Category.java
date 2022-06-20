public class Category {
    private String name;
    private Product[] products;
    public Category(String name, Product[] products){
        this.name=name;
        this.products=products;
    }
    public void setName(String name1){
        name=name1;
    }
    public void setProducts(Product[] products1){
        products=products1;
    }

    public String getName(){
        return name;
    }
    public Product[] getProducts(){
        return products;
    }
}
