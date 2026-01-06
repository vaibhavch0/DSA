package binary srch;

public class srchinkrotetedarr {
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // If the left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1; // Search in the left half
                } else {
                    low = mid + 1; // Search in the right half
                }
            } else {
                // If the right half is sorted
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1; // Search in the right half
                } else {
                    high = mid - 1; // Search in the left half
                }
            }
        }

        return -1; // Target not found
    }
}
// is code m hamne low aur high ko update kiya hai or check kiya hai ki target kis half m hai agr target mil jata hai to mid return karte hai
// check kiya left half me agar target milta hai to high ko mid-1 kar dete hai warna low ko mid+1 kar dete hai
// right half me bhi wahi check karte hai
