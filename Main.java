import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inpuString = sc.nextLine();

        // extracting input values
        String []stringArray = inpuString.split("#");

        int []array1 = Arrays.stream(stringArray[0].split(",")).mapToInt(Integer::parseInt).toArray();
        int []array2 = Arrays.stream(stringArray[1].split(",")).mapToInt(Integer::parseInt).toArray();

        // printing merged array
        System.out.println(Arrays.toString(MergeArrays.mergeArrays(array1, array2)));
    
        // closing resource
        sc.close();
    }
}