public class HomeworkLesson3_5 {
    public static void tringle(int sideLength){ // drawing a right triangle
        for(int x=0;x!=sideLength;x++){
            for(int y=0;y<=x;y++) System.out.print("*");
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        tringle(10);
    }
}
