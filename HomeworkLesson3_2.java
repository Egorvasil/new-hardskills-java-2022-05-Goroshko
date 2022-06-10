public class HomeworkLesson3_2{
    public static int sumFifths(int[] numbers){ // calculates the sum of a multiple of five
        int answer=0;
        for(int i:numbers) if(i%5==0) answer+=i;
        return answer;
    }
    static int[] numbers={0, 4, 5, 11, 23, 55, 155, 22, 90, 1223, -15, -27, -100};

    public static void main(String[] args) {
        System.out.println(sumFifths(numbers));
    }
}
