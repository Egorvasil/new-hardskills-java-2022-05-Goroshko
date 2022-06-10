import static java.lang.Math.abs;

public class HomeworkLesson3_8 {
    public static int findFactorial(long maximum,long minimum,long alfa){ // search for a factorial included in the intervals minimum-maximum
        for(int x=1,a=1;a<=maximum;a*=x,x++) if ((x % alfa == 0) && (a >= minimum)) return a;
        return -1;
    }
    static long maximum=1278945280,minimum=40320,alfa=11;
    public static void main(String[] args) {
        System.out.println(findFactorial(maximum,minimum,alfa));;
    }
}