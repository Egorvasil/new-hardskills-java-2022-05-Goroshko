public class User {
    String login,password;
    Basket basket;
    public User(String login,String password,Basket basket){
        this.login=login;
        this.password=password;
        this.basket=basket;
    }
    public void setLogin(String login1){
        login=login1;
    }
    public void setPassword(String password1){
        password=password1;
    }
    public void setbasket(Basket basket1){
        basket=basket1;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    private Basket getBasket(){
        return basket;
    }
}
