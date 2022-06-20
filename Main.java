public class Main {
    public static void main(String[] args) {
        System.out.println("Matrix test");
        Matrix matrix = new Matrix(5,5);
        Matrix matrix1 = new Matrix(5,5);
        matrix.setValue(0,0,2);
        matrix.setValue(2,0,3);
        matrix.multiplicationMatrixByNumber(2);
        matrix1.setValue(0,1,3);
        matrix1.setValue(2,0,2);
        matrix.matrixAddition(matrix1);
        matrix.displayingTheMatrix();
        System.out.println("+\nStudents,Aspirants");
        Student[] c = {new Student("Ivan","Ivanov",42,5),new Aspirant("Vasya","Vasiliev",33,5),new Student("Igor","Igorev",13,3),new Aspirant("Stepan","Stepa",3,2.7)};
        for(int i=0;i!=c.length;i++) System.out.println(c[i].getScholarship());
        System.out.println("+\nProducts,Category, ...");
        User user = new User("killer2004","qwery-",new Basket(new Product[]{new Product("zucchini", 150, 7),new Product("tomato", 175, 6)}));
        user.setPassword("qwerty-");
        System.out.printf("user: %s; password: %s",user.getLogin(),user.getPassword());
        Category category = new Category("fruit",new Product[]{new Product("apple", 240, 9),new Product("orange", 235, 8)});
        System.out.printf("category name: %s; products name: %s, %s",category.getName(),category.getProducts()[0].getName(),category.getProducts()[1].getName());
    }
}