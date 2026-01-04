// package binary srch;
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {

//         int i = m - 1;
//         int j = n - 1;
//         int k = m + n - 1;

//         while (j >= 0) {
//             if (i >= 0 && nums1[i] > nums2[j]) {
//                 nums1[k] = nums1[i];
//                 i--;
//             } else {
//                 nums1[k] = nums2[j];
//                 j--;
//             }
//             k--;
//         }
//     }
// }
// is code me hamne do sorted arrays ko merge kiya hai bina extra space use kiye
// logic ye hai ki hum last se merge karte hain taaki hume extra space na use karni pade
