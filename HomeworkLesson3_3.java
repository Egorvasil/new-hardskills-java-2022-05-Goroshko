public class HomeworkLesson3_3 {
    public static void flipper(int number){ // flips the number
        System.out.print(number%10);
        while(number>=10) System.out.print((number/=10)%10);
    }
    static int number=231314;
    public static void main(String[] args) {
        flipper(number);
    }
}
