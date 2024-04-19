public class Main {
    public static void main(String[] args) {
    ComplexNumber c1 = new ComplexNumber(3, 4);
    ComplexNumber c2 = new ComplexNumber(5, 6);
    ComplexNumber c3 = ComplexNumber.sum(c1, c2);
    System.out.println(c3);
    System.out.println(c3.getMagnitude());
    }
}