package console2D;

import java.io.IOException;

public class Screen {
    static char[][] sc;
    private static int weight, height;
    public Screen(int weight, int height){
        this.sc = new char[height][weight];
        this.weight = weight;
        this.height = height;
    }
    public void draw() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        for(int i=0;i!=height;i++){
            for(int j=0;j!=weight;j++){
                System.out.print(sc[i][j]);
            }
            System.out.println();
        }
    }
    public void fill(char symbol){
        for(int i=0;i!=height;i++){
            for(int j=0;j!=weight;j++){
                sc[i][j]=symbol;
            }
        }
    }
    public char[][] getScreen(){
        return this.sc;
    }
    public void setScreen(char[][] sc){
        this.sc=sc;
    }
}
