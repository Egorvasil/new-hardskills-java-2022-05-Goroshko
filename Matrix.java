public class Matrix {
    public Matrix(int height, int width){
        this.height=height;
        this.width=width;
        this.numberMatrix = new int[width][height];
    }
    private int height,width;
    private int[][] numberMatrix = new int[width][height];
    public int[][] getMatrix(){
        return numberMatrix;
    }
    public void setValue(int indexW, int indexH, int value){ // sets "value" to position "indexW", "indexH"
        numberMatrix[indexW][indexH] = value;
    }
    public void multiplicationMatrixByNumber(int multiplier){ // multiplies all matrix numbers by "multiplier"
        for(int i=0;i!=width;i++) for(int j=0;j!=height;j++) numberMatrix[i][j] *= multiplier;
    }
    public void matrixAddition(Matrix Matrix1){ // adds "Matrix1" to matrix
        int[][] numberMatrix1=Matrix1.getMatrix();
        for(int i=0;i!=width;i++) for(int j=0;j!=height;j++) numberMatrix[i][j]+=numberMatrix1[i][j];
    }
    public void matrixMultiplication(Matrix Matrix1){ // multiplies "Matrix1" by matrix
        int[][] numberMatrix1=Matrix1.getMatrix();
        for(int i=0;i!=width;i++) for(int j=0;j!=height;j++) numberMatrix[i][j]*=numberMatrix1[i][j];
    }
    public void displayingTheMatrix(){ // displays matrix to console
        for(int i=0;i!=width;i++) {
            for(int j=0;j!=height;j++){
                System.out.print(numberMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
