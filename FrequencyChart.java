import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyChart {

    public static boolean isValid(String word){
        char[] goodChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        boolean works = true;

        for (int i = 0; i < word.length(); ++i){
            boolean temp = false;

            for (char num : goodChars){
                temp = temp || word.charAt(i) == num;
            }

            works = works && temp;
        }

        return works;
    }

    public static ArrayList<Integer> getNums(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Type any letter to quit");
        System.out.println();

        ArrayList<Integer> nums = new ArrayList<>();

        int input;

        while (true){

            System.out.print("-> ");
            try {
                input = scan.nextInt();
                nums.add(input);
            }
            catch (Exception e){
                break;
            }
        }

        return nums;
    }

    public static void display(ArrayList<Integer> nums){
        int[] data = new int[10];
        for (int i = 0; i < 10; ++i){
            for (int num : nums){
                if (num > i*10 && num < (i+1)*10){
                    data[i]++;
                }
            }
        }

        System.out.print(" ");
        for (int i = 0; i < 10; ++i){
            System.out.print(" "+i*10+" - "+(i+1)*10+": ");
            for (int k =0; k<data[i]; ++k){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = getNums();

        display(nums);
    }
}
