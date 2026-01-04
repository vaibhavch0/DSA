package binary srch;

public class Sortcolor {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// is code m 3 colors ko sort karne ka logic hai bina extra space use kiye
// isme humne 3 pointers ka use kiya hai low, mid aur high
// low pointer 0s ke liye, mid pointer 1s ke liye aur high pointer 2s ke liye
// isse humein 3 colors ko sort karne me madad milti hai

