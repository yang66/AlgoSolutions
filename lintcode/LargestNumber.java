/*
 * Given a list of non negative integers, arrange them such that they form the largest number.

 Notice

The result may be very large, so you need to return a string instead of an integer.

Example
Given [1, 20, 23, 4, 8], the largest formed number is 8423201.

Challenge 
Do it in O(nlogn) time complexity.
 */
public class LargestNumber {

    /**
     *@param num: A list of non negative integers
     *@return: A string
     */
    public String largestNumber(int[] num) {
        Arrays.sort(num, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1.intValue() - i2.intValue();
            }
        };
        String result = "";
        for (int i = 
    }

    public void quicksort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int index = start;
        for (int i = start; i <= end; ++i) {
            if (compare(nums[i], nums[end])) {
                swap(nums, index++, i);
            }
        }
        swap(nums, index, end);
        quicksort(nums, start, index - 1);
        quicksort(nums, index + 1, end);
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public boolean compare(int x, int y) {
        return Long.parseLong("" + x + y) < Long.parseLong("" + y + x);
    }

}
