import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    //Task1

//        int[] x = {5,2,3,1};
//
//        for (int i = 0; i < x.length; i++) {
//            for (int j = i +1 ; j < x.length; j++) {
//                int tmp = 0;
//                if (x[i] > x[j]){
//                    tmp = x[i];
//                    x[i] = x[j];
//                    x[j] = tmp;
//                }
//            }
//        }
//
//        for (int n: x) {
//            System.out.print(n);
//        }


        //Task2

        

        int[] xx = {6,5,-1,0,1,2,3};
        Arrays.sort(xx);
        int count =0;
        for (int i = 0; i < xx.length; i++) {
            if (xx[i] >= 0){
                if (xx[i] != count){
                    System.out.println(count);
                    break;
                }
                count ++;
            }


        }



    }


}