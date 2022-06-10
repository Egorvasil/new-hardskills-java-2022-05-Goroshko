public class HomeworkLesson3_4 {
    public static int MinPlusMax(int number,int minimum,int maximum){ // calculates the sum of the maximum number and the minimum
        while(number>=10) {
            if(minimum>number%10) minimum=number%10;
            if(maximum<number%10) maximum=number%10;
            number/=10;
        }
        return minimum+maximum;
    }
    static int number=103281234,minimum=10,maximum=-1;
    public static void main(String[] args) {

        System.out.print(MinPlusMax(number,minimum,maximum));
    }
}
