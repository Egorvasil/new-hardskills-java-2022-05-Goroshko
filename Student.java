public class Student {
    private String firstName,lastName;
    int group;
    double averageMark;
    public Student(String firstName,String lastName,int group, double averageMark){
        this.firstName=firstName;
        this.lastName=lastName;
        this.group=group;
        this.averageMark=averageMark;
    }
    public int getScholarship(){
        return ((averageMark==5) ? 150 : 100);
    }
}
