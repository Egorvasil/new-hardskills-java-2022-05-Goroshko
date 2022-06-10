import static java.lang.Math.sqrt;

public class HomeworkLesson3_1{
    public static void findOdd(int[] numbers){
        for(int i:numbers) if(i%2==0) System.out.println(i);
    }
    static int[] numbers={1, 3, 11, 2, 4, 102, 155, 171, 2990, 123, -2, -3, 18};
    public static void main(String[] args) {
        findOdd(numbers);
    }
}
