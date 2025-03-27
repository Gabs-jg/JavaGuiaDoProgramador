public class Matriz {
    public static void main(String[] args) {
        double m[][] = new double [3][4]; //Declara matriz 3x4
        for(int l=0; l<m.length; l++) {
            for(int c=0; c<m.length; c++) {
                m[l][c] = l*m[l].length + c;
            }
        }
        for(int l=0; l<m.length; l++) {
            for(int c=0; c<m.length; c++) {
                System.out.print(m[l][c] + "\t");
            }
            System.out.println();
        }
    }
    
}
