public class HomeworkLesson2 {
    static long salary=75_000; // зарплата
    static double taxes=0.13; // налоги
    static long newSalary=(long) (salary-(salary*taxes));
    public static void main(String[] args) {
        System.out.println(newSalary);
    }
}