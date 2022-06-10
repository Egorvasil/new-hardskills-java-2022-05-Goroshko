import static java.lang.Math.abs;

public class HomeworkLesson3_6 {
    public static void tringle(int baseLength){ // derivation of an isosceles triangle
        for(int x=0;x!=baseLength;x++){
            for(int y=0;y<=x;y++) System.out.print("* ");
            System.out.print("\n");
        }
        for(int x=0;x!=baseLength;x++){
            for(int y=0;y<baseLength-x-baseLength%2;y++) System.out.print("* ");
            System.out.print("\n");
        }
    }
    static int baseLength=10;
    public static void main(String[] args) {
        tringle(baseLength);
    }
}
