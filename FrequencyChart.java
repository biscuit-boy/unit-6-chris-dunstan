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

        String input = "0";

        while (isValid(input)){
            
            System.out.print("-> ");
            input = scan.next();

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = getNums();

        display(nums);
    }
}
