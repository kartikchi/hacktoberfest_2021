/*
    Given a sorted array of numbers, find if a given target is present in the array. Though we know that the array is sorted, we don’t know if it’s sorted in ascending or descending order. Hence Order Agnostic Binary Search is used to know if array is sorted in ascending or descending order and also returns if target is present in array or not
*/
public class orderAgnosticBinarySearch {

    public static void main(String[] args){
        int[] array = {5,4,3,2,1};
        int target = 4;
        //int target = 6;
        int res = orderAgnosticBS(array,target);
        if(res==-1){
            System.out.println("Given target is not found in array");
        }
        else{
            System.out.println("Given target " + target + " is found in positon " + res + " of the array");
        }
    }
    public static int orderAgnosticBS(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        boolean isAscending = array[start]<array[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(array[mid] == target){
                return mid;
            }
            if(isAscending){
                if(target<array[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target<array[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }//end-of-while-loop
        return -1;
    }
}
