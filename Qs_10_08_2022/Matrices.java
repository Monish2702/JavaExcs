// Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object. The Matrix class has the following information:
// 1 - number of rows of matrix
// 2 - number of columns of matrix
// 3 - elements of matrix in the form of 2D array

// The Matrix class has methods for each of the following:
// 1 - get the number of rows
// 2 - get the number of columns
// 3 - set the elements of the matrix at given position (i,j)
// 4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
// 5 - multiplying the two matrices

package Qs_10_08_2022;
import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix1: ");
        int rows1 = cin.nextInt();
        int columns1 = cin.nextInt();
        Matrix matrix1 = new Matrix(rows1, columns1);
        matrix1.setElements(0, 0, 45);   // set the element at position (0,0) alone to 45
        // System.out.println("Enter the elements of the matrix1: ");
        // // matrix1.setElements();
        // for (int i = 0; i < rows1; i++) {
        //     for (int j = 0; j < columns1; j++) {
        //         matrix1.setElements(i, j, cin.nextFloat());
        //     }
        // }
        System.out.println("Enter the number of rows and columns of the matrix2: ");
        int rows2 = cin.nextInt();
        int columns2 = cin.nextInt();
        Matrix matrix2 = new Matrix(rows2, columns2);
        matrix2.setElements(0, 0, 45);
        // System.out.println("Enter the elements of the matrix2: ");
        // //matrix2.setElements();
        // for (int i = 0; i < rows2; i++) {
        //     for (int j = 0; j < columns2; j++) {
        //         matrix2.setElements(i, j, cin.nextFloat());
        //     }
        // }
        System.out.println("The sum is: ");
        matrix1.add(matrix2);
        System.out.println();
        System.out.println("The multiplication is: ");
        matrix1.multiply(matrix2);
        cin.close();
    }
}

class Matrix {
    private int rows, columns;
    private float[][] elements;
    Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new float[this.rows][this.columns];
        //initialize the elements of the matrix to 0
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.elements[i][j] = 0;
            }
        }
    }

    public int getRows() {
        return this.rows;
    }
    public int getColumns() {
        return this.columns;
    }
    public void setElements(int i, int j, float value) {
        this.elements[i][j] = value;
    }
    public float getElements(int i, int j) {
        return this.elements[i][j];
    }
    // sum of two matrices
    public void add(Matrix m) {
        if (this.rows == m.rows && this.columns == m.columns) {
            Matrix sum = new Matrix(this.rows, this.columns);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    sum.elements[i][j] = this.elements[i][j] + m.elements[i][j];
                    System.out.print(sum.elements[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrices cannot be added");
        }
    }

    // multiplication of two matrices
    public void multiply(Matrix m) {
        if (this.columns == m.rows) {
            Matrix product = new Matrix(this.rows, m.columns);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < m.columns; j++) {
                    for (int k = 0; k < this.columns; k++) {
                        product.elements[i][j] += this.elements[i][k] * m.elements[k][j];
                    }
                    System.out.print(product.elements[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrices cannot be multiplied");
        }
    }
}