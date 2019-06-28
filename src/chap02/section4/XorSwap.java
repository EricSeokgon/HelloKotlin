package chap02.section4;

public class XorSwap {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 25;

        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
    }
}
