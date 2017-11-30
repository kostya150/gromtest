package lesson8.ArithmeticAdder;

public class Demo {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int[] array = {5,5,6,8,3,6,3};
        adder.check(array);
        System.out.println(adder.check(array));
        adder.add(7,8);
        System.out.println(adder.add(7,8));
    }
}
