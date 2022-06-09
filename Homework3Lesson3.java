public class Homework3Lesson3 {
    static int number=231314;
    public static void main(String[] args) {
        System.out.print(number%10);
        while(number>=10) System.out.print((number/=10)%10);
    }
}