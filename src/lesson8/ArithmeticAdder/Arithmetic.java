package lesson8.ArithmeticAdder;

import java.lang.reflect.Array;

public class Arithmetic {


    boolean check(int[] array){
        int max = array[0];
        int min = array[0];
        for(int i = 0; i <= array.length; i++){
            if(i < min)
                min = i;
        }

        for(int i = 0; i<= array.length; i++){
            if(i > max)
                max = i;
        }
        int sum = min + max;
        if(sum > 100)
            return true;
        return false;
    }
}
