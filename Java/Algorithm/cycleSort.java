/*
    CYCLE SORT--> Cycle sort is an in-place sorting Algorithm, unstable sorting algorithm.
*/
import java.util.Arrays;
public class cycleSort {
    public static void main(String[] args){

        int[] array = {3,5,4,1,2};

        cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void cyclicSort(int[] array){
        int i=0;
        while(i<array.length){
            int correctIndex = array[i] - 1;
            if(array[i] != array[correctIndex]){
                swap(array,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] array, int i, int correctIndex){
        int temp = array[i];
        array[i] = array[correctIndex];
        array[correctIndex] = temp;
    }
}
