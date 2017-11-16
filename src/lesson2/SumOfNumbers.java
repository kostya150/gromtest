package lesson2;
public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int b = 1234;


            for(int a=1;a<=1000;a++){
                sum+=a;
    }




        int c1 = sum/b;
        int c2 = sum %b;


        while(c2>sum){
            System.out.println("true");
            break;
        }
         while(c2<=sum){
             System.out.println("false");
             break;
         }




    }
}
