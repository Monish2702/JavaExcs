// Print the sum, difference and product of two complex numbers by creating a class 
// named 'Complex' with separate methods for each operation 
// whose real and imaginary parts are entered by user.
package Programs.QuestionsSolved;
import java.util.Scanner;

public class ComplexNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of first complex number: ");
        float real1 = sc.nextFloat();
        float img1 = sc.nextFloat();
        System.out.println("Enter the real and imaginary part of second complex number: ");
        float real2 = sc.nextFloat();
        float img2 = sc.nextFloat();
        Complex compx1 = new Complex(real1, img1, real2, img2);
        compx1.getSum();
        compx1.getDifference();
        compx1.getProduct();
        sc.close();
    }
}

class Complex {
    float real1, imaginary1, real2, imaginary2, real_sum, img_sum, real_difference, img__difference, real_product,
            img_product;

    Complex(float real1, float imaginary1, float real2, float imaginary2) {
        this.real1 = real1;
        this.imaginary1 = imaginary1;
        this.real2 = real2;
        this.imaginary2 = imaginary2;
    }

    public void getSum() {
        real_sum = real1 + real2;
        img_sum = imaginary1 + imaginary2;
        System.out.println("Sum of complex nos is: " + real_sum + " + " + img_sum + "i");
    }

    public void getDifference() {
        real_difference = real1 - real2;
        img__difference = imaginary1 - imaginary2;
        System.out.println("Difference of complex nos is: " + real_difference + " + " + img__difference + "i");
    }

    public void getProduct() {
        real_product = real1 * real2 - imaginary1 * imaginary2;
        img_product = real1 * imaginary2 + real2 * imaginary1;
        System.out.println("Product of complex nos is: " + real_product + " + " + img_product + "i");
    }
}
