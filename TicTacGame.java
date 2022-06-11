import java.io.IOException;
import java.util.Scanner;

public class TicTacGame {
    public static void drawMap(){ // map drawing
        for(int i=0;i!=3;i++){
            for(int j=0;j!=3;j++) {
                System.out.print((map[i][j]==0) ? "-" : ((map[i][j]==1) ? "o" : "x"));
                System.out.print((j!=2) ? "|" : "\n");
            }
            if(i!=2) System.out.println("-----");
        }
    }
    public static boolean winCheck(){ // map drawing
        for(int i=0;i!=3;i++){
            if((map[0][i]!=0 && map[0][i]==map[1][i] && map[0][i]==map[2][i]) || (map[i][0]!=0 && map[i][0]==map[i][1] && map[0][i]==map[i][2])) return true;
        }
        if((map[0][0]!=0 && map[0][0]==map[1][1] && map[1][1]==map[2][2]) || (map[2][0]!=0 && map[2][0]==map[1][1] && map[1][1]==map[0][2])) return true;
        return false;
    }
    public static void dataInputs() { // map drawing
        y = scanner.nextInt()-1;
        x = scanner.nextInt()-1;
        sign = (char) scanner.next(".").toCharArray()[0];
        map[x][y]=((sign=='o') ? 1 : 2);
    }
    public static int currentPlayer=1,x=0,y=0;
    public static char sign = 'o';
    public static int[][] map = new int[3][3];
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            System.out.println("Current player is: " + (currentPlayer) + "\n");
            dataInputs();
            drawMap();
            if (winCheck()) {
                System.out.println("=====\n");
                drawMap();
                System.out.println("\nPlayer " + (currentPlayer) + " win!");
                return;
            }
            currentPlayer=((currentPlayer==1) ? 2 : 1);
        }
    }
}