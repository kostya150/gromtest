package lesson4;

public class ConcatExercise {
    public static void main(String[] args) {
        concat("First", "Second","Third");

    }

    public static String concat(String a, String b, String c){
        String result = a + b + c;
        System.out.println(result);
        return result;
    }
}
