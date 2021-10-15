/*
    Binary Search --> This is a searching algorithm which is applied on sorted array to find the target. The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n). 
*/


public class binary {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        int target = 5;
        int res = binarySearch(array, target);
        if(res==-1){
            System.out.println("Given target is not found in array");
        }
        else{
            System.out.println("Given target " + target + " is found in positon " + res + " of the array");
        }
    }
    public static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target < array[mid]){
                end = mid-1;
            }
            else if(target > array[mid]){
                start=mid+1;
            }
            else{
                return  mid;
            }
        }
        return -1;
    }
}
