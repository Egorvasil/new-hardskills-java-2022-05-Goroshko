import static java.lang.Math.abs;

public class HomeworkLesson3_7 {
    public static void chess(int lenght){ // displaying numbers in a checkerboard pattern
        for(int x=0;x!=lenght;x++){
            for(int y=0,number=1;y!=lenght;y++,number++) System.out.print((((x%2+y%2)!=1) ? 0 : number)+"\t");
            System.out.print("\n");
        }
    }
    static int lenght=3;
    public static void main(String[] args) {
        chess(lenght);
    }
}
