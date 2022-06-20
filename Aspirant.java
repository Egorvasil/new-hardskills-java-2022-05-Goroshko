public class Aspirant extends Student{

    public Aspirant(String firstName, String lastName, int group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }
    public int getScholarship(){
        return ((averageMark==5) ? 300 : 200);
    }
}
