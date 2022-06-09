public class HomeworkLesson3_2{
    static int[] numbers={0, 4, 5, 11, 23, 55, 155, 22, 90, 1223, -15, -27, -100};
    static int answer=0;
    public static void main(String[] args) {
        for(int i:numbers) if(i%5==0) answer+=i;
        System.out.println(answer);
    }
}
