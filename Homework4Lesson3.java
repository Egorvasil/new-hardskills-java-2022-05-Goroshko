public class Homework4Lesson3 {
    static int number=103281234,minimum=10,maximum=-1;
    public static void main(String[] args) {
        while(number>=10) {
            if(minimum>number%10) minimum=number%10;
            if(maximum<number%10) maximum=number%10;
            number/=10;
        }
        System.out.print(minimum+maximum);
    }
}