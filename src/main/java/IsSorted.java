public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        if (arr.length == 0){ return true;}

        for (int i = 1; i < arr.length; i++){
            int temp = i-1;
            if (arr[temp] > arr[i]) {
                return false;
            }
        }
            
        return true;
    }
}
