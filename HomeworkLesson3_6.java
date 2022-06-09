import static java.lang.Math.abs;

public class HomeworkLesson3_6 {
    static int lenght=10;
    public static void main(String[] args) {
        for(int x=0;x!=lenght;x++){
            for(int y=0;y<=x;y++) System.out.print("*   ");
            System.out.print("\n");
        }
        for(int x=0;x!=lenght;x++){
            for(int y=0;y<lenght-x-lenght%2;y++) System.out.print("*   ");
            System.out.print("\n");
        }
    }
}
