package entity;

public class Entity {
    private int force,health,maxHealth,money=0;
    private double shield;


    public Entity(int force, int health, int maxHealth, int money){
        this.force=force;
        this.health=health;
        this.maxHealth=maxHealth;
        this.money=money;
    }
    public void heal(int number){
        health+=number;
        if(health>maxHealth) health=maxHealth;
    }
    public boolean takeDamage(int number){
        this.health-=number;
        if(health<=0) {
            health=0;
            return true;
        }
        return false;
    }
    public void addMoney(int number){
        this.money+=number;
    }
    public void addMaxHealth(int number){
        this.maxHealth+=number;
    }
    public boolean takeMoney(int number){
        if(money-number<0) return false;
        this.money-=number;
        return true;
    }
    public float getHealthPercent(){
        return health/maxHealth;
    }
    public int getHealth(){
        return health;
    }
    public int damage(){
        return force;
    }
    public void setDamage(int force){
        this.force = force;
    }
    public int getMoney(){
        return money;
    }
}
