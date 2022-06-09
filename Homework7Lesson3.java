import static java.lang.Math.abs;

public class Homework7Lesson3 {
    static int lenght=3,number=1;
    public static void main(String[] args) {
        for(int x=0;x!=lenght;x++){
            for(int y=0;y!=lenght;y++,number++) System.out.print((((x%2+y%2)!=1) ? 0 : number)+"\t");
            System.out.print("\n");
        }
    }
}