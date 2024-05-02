class Complex {
    int real;
    int imaginary;

    Complex() {}

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class ComplexNumber {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 5);
        Complex c2 = new Complex(6, 7);
        Complex sum = c1.add(c2);
        sum.display();
    }
}
