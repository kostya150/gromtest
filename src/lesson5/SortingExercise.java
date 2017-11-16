package lesson5;

public class SortingExercise {
    public static void main(String[] args) {
        int[] array = {0,15,56,47,246,7,2,1,10,100};
        arraysortAscending(array);
        arraysortDescending(array);



    }
    public static int[] arraysortAscending(int[] array){
        for (int i = 0; i < array.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = array[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < array.length; j++) {
                //Если находим, запоминаем его индекс
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        return array;

    }
    public static int[] arraysortDescending(int[] array){
        int temp = 0;
        for (int j = 0; j < array.length; j++)
            for (int k = 0; k < array.length - 1; k++) {
                if (array[k] < array[k + 1]) {
                    temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }


        return array;

    }
}
