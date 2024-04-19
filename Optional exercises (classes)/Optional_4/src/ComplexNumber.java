public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(){

    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public String toString(){
        return real + " - " + imaginary + "i";
    }

    public double getMagnitude(){
        return Math.sqrt(real*real + imaginary*imaginary);
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber c3 = new ComplexNumber();
        c3.setReal(c1.getReal() + c2.getReal());
        c3.setImaginary(c1.getImaginary() + c2.getImaginary());
        return c3;
    }
}
