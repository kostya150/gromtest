package lesson4;

public class CountExercise {
    public static void main(String[] args) {
        findDivCount((short)0, (short)20,5);
        findDivCount((short)0, (short)100,4);

    }
    private static int findDivCount(short a, short b, int n) {
        int count = 0;
        for(int i = a; i <= b; i++){
            if(i % n == 0 && n>0){
                count++;
            }
        }
        return 0;
    }
}
