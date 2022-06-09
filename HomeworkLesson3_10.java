import static java.lang.Math.abs;

public class HomeworkLesson3_10 {
    static long lenght=0;
    static int[] array={-3, 100, 23, 0, 12, 33, 4, 15, 4};
    public static void main(String[] args) {
        for(int i=0,minimum=0,x=0;i!=array.length;i++,minimum=i){
            for(int j=i+1;j!=array.length;j++) if(array[minimum]>array[j]) minimum=j;
            x=array[minimum];
            array[minimum]=array[i];
            array[i]=x;
        }
        for(int i:array) System.out.print(i+" ");
    }
}