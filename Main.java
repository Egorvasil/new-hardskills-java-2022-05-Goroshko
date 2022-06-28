import console2D.*;
import entity.Entity;

import javax.crypto.spec.PSource;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Screen sc = new Screen(60,4);
    private static String console, place;
    private static Entity player = new Entity(10,100,100,4), enemy;
    private static boolean gameRun=true;
    private static int time=0;
    private static Scanner in = new Scanner(System.in);
    private static boolean cave() throws IOException, InterruptedException {
        enemy = new Entity(10,100,100,10);
        sc.fill(' ');
        while(true) {
            Draw.text(sc, "Player", new int[]{0, 0});
            Draw.text(sc, "hp " + new String(String.valueOf(player.getHealth())), new int[]{0, 1});
            Draw.text(sc, "dm " + new String(String.valueOf(player.damage())), new int[]{0, 2});
            Draw.dot(sc,'X',new int[] {7,1});
            Draw.text(sc, "Enemy", new int[]{9, 0});
            Draw.text(sc, "hp " + new String(String.valueOf(enemy.getHealth())), new int[]{9, 1});
            Draw.text(sc, "dm " + new String(String.valueOf(enemy.damage())), new int[]{9, 2});
            Draw.text(sc, "a - Attack", new int[]{20, 0});
            Draw.text(sc, "h - Healing", new int[]{20, 1});
            Draw.text(sc, "g - Get out of the cave", new int[]{20, 2});
            Draw.text(sc, "$" + new String(String.valueOf(player.getMoney())), new int[]{41, 0});
            sc.draw();
            sc.fill(' ');
            console = in.nextLine();
            switch (console) {
                case "a":
                    if (enemy.takeDamage(player.damage())) {
                        player.addMoney(enemy.getMoney());
                        enemy = new Entity(10, 100, 100, 10);
                    }
                    break;
                case "h":
                    player.heal(12);
                    break;
                case "g":
                    return false;
                default:
                    System.out.printf("%s?", console);
                    break;
            }
            if(player.takeDamage(enemy.damage())) return true;
        }
    }
    public static void store() throws IOException, InterruptedException{
        sc.fill(' ');
        while(true){
            Draw.text(sc, "0 - sword for 12 damage, $15", new int[]{0, 0});
            Draw.text(sc, "1 - sword for 18 damage, $21", new int[]{0, 1});
            Draw.text(sc, "2 - sword for 20 damage, $27", new int[]{0, 2});
            Draw.text(sc, "3 - fully cured, $20", new int[]{30, 0});
            Draw.text(sc, "4 - max. health +10, $42", new int[]{30, 1});
            Draw.text(sc, "g - Get out of the store, $2", new int[]{30, 2});
            sc.draw();
            sc.fill(' ');
            console = in.nextLine();
            switch (console) {
                case "0":
                    if(player.takeMoney(15)) player.setDamage(12);
                    else Draw.text(sc, "No money", new int[]{0, 3});
                    break;
                case "1":
                    if(player.takeMoney(21)) player.setDamage(18);
                    else Draw.text(sc, "No money", new int[]{0, 3});
                    break;
                case "2":
                    if(player.takeMoney(27)) player.setDamage(20);
                    else Draw.text(sc, "No money", new int[]{0, 3});
                    break;
                case "3":
                    if(player.takeMoney(20)) player.heal(2022);
                    else Draw.text(sc, "No money", new int[]{0, 3});
                    break;
                case "4":
                    if(player.takeMoney(42)) player.addMaxHealth(10);
                    else Draw.text(sc, "No money", new int[]{0, 3});
                    break;
                case "g":
                    if(player.takeMoney(2)) return;
                    else Draw.text(sc, "No money", new int[]{0, 3});
                    break;
                default:
                    System.out.printf("%s?", console);
                    break;
            }
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        sc.fill(' ');
        while(gameRun){
            Draw.text(sc, "Player", new int[]{25, 0});
            Draw.text(sc, "hp " + new String(String.valueOf(player.getHealth())), new int[]{25, 1});
            Draw.text(sc, "dm " + new String(String.valueOf(player.damage())), new int[]{25, 2});
            Draw.text(sc,"c - go to the cave,  $1", new int[] {0,0});
            Draw.text(sc,"s - go to the store, $3", new int[] {0,1});
            Draw.text(sc,"  - run away from here", new int[] {0,2});
            Draw.text(sc, "$" + new String(String.valueOf(player.getMoney())), new int[]{35, 0});
            sc.draw();
            sc.fill(' ');
            place = in.nextLine();
            switch (place){
                case "c":
                    if(player.takeMoney(1)) {
                        if(cave()){
                            System.out.println("You death");
                            return;
                        }
                    }
                    else Draw.text(sc, "No money", new int[]{0, 3});
                    break;
                case "s":
                    if(player.takeMoney(3)) store();
                    else Draw.text(sc, "No money", new int[]{0, 3});
                    break;
                default:
                    return;
            }
            time++;
        }
        in.close();
    }
}
