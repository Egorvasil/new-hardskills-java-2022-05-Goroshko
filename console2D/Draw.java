package console2D;


public class Draw {
    public static void rectangle(Screen screen,char symbol,int[] startPos,int[] endPos, int w){
        for(int i=0;i<=(endPos[0]-startPos[0]);i+=((startPos[0]<=endPos[0]) ? 1 : -1)){
            for(int j=0;j<=(endPos[1]-startPos[1]);j+=((startPos[1]<=endPos[1]) ? 1 : -1)){
                if((i<w || j<w) || (i>(endPos[0]-startPos[0])-w || j>(endPos[1]-startPos[1])-w) || w==0) {
                    screen.sc[startPos[1]+j][startPos[0]+i]=symbol;
                }
            }
        }
    }
    public static void dot(Screen screen, char symbol, int[] pos){
        screen.sc[pos[1]][pos[0]]=symbol;
    }
    public static void text(Screen screen, String text, int[] pos){
        int index=pos[0];
        for(char i:text.toCharArray()) {
            screen.sc[pos[1]][index] = ((i==' ') ? screen.sc[pos[1]][index] : i);
            index++;
        }
    }
}
