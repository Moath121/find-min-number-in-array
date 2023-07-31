import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

  
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
