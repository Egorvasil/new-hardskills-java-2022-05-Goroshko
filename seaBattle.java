import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class seaBattle {

    public static void drawMap(int[][][] map,int Player){ // displays an array
        for(int i=0;i!=10;i++){
            for(int nn=0;nn!= map.length;nn++) {
                for (int j = 0; j != 10; j++) {
                    System.out.print((((map[nn][i][j] == 0) || (map[nn][i][j] == 3)) ? "~" : ((map[nn][i][j] == 1) ? "X" : "-")));
                }
                if(nn==0) System.out.print(((i!=5) ? "   " : ((Player==0) ? " ← " : " → ")));
            }
            System.out.print("\n");
        }
    }

    public static int[][] makeMap(){
        Scanner in = new Scanner(System.in);
        int[][] map = new int[10][10];
        int x,y,rotate;
        System.out.println("\n >       [x→,y↓]");
        y = in.nextInt()-1;x = in.nextInt()-1;map[x][y]=3;
        System.out.println(" <>      [x→,y↓,rotate(0→,1↓)]");
        y = in.nextInt()-1;x = in.nextInt()-1;
        rotate = in.nextInt();
        for(int i=0;i!=2;i++) map[x+((rotate==1) ? i : 0)][y+((rotate==0) ? i : 0)]=3;
        System.out.println(" <=>     [x→,y↓,rotate(0→,1↓)]");
        y = in.nextInt()-1;x = in.nextInt()-1;
        rotate = in.nextInt();
        for(int i=0;i!=3;i++) map[x+((rotate==1) ? i : 0)][y+((rotate==0) ? i : 0)]=3;
        System.out.println(" <==>    [x→,y↓,rotate(0→,1↓)]");
        y = in.nextInt()-1;x = in.nextInt()-1;
        rotate = in.nextInt();
        for(int i=0;i!=4;i++) map[x+((rotate==1) ? i : 0)][y+((rotate==0) ? i : 0)]=3;
        return map;
    }

    public static int[][][] map = new int[2][10][10];
    public static int[] score = new int[2];
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        for(int i=0;i!=1;i++) {
            System.out.printf("Player %d:",i+1);
            map[i] = makeMap();
        }
        for(int i=0;true;i=(i+1)%2) {
            drawMap(map,i);
            System.out.println("[x→,y↓]");
            int y = in.nextInt() - 1, x = in.nextInt() - 1;
            if (map[i][x][y] != 3) {
                System.out.println("Miss...");
                score[i]++;
                map[i][x][y] = 2;
            } else {
                System.out.println("Hit!");
                score[i]++;
                map[i][x][y] = 1;
            }
            if(score[i]==10){
                System.out.printf("Player %d win!",i+1);
                return;
            }
            TimeUnit.SECONDS.sleep(2);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
    }
}
