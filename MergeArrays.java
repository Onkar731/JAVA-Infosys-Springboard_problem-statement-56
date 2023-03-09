public class MergeArrays {
    public static int[] mergeArrays(int []array1, int []array2) {
        int []mergedArray = new int[array1.length + array2.length];

        int index1 = 0;
        int index2 = 0;

        // merging two arrays
        while(index1 < array1.length) {
            mergedArray[index2++] = array1[index1];
            mergedArray[index2++] = array2[index1];
            index1++;
        }

        // returning merged array
        return mergedArray;
    }
}