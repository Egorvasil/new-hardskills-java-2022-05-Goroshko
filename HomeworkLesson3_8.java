import static java.lang.Math.abs;

public class HomeworkLesson3_7 {
    static long maximum=1278945280,minimum=40320;
    public static void main(String[] args) {
        for(int x=1,a=1;a<=maximum;a*=x,x++){
            if((x%11==0) && (a>=minimum)) {
                System.out.print(a);
                break;
            }
        }
    }
}