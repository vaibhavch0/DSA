// package arrayy;

// public class removedub {
//     public int removeDuplicates(int[] nums) {
//         if(nums.length==0) return 0;
//         int i=0;
//         for(int j=1;j<nums.length;j++){
//             if(nums[j]!=nums[i]){
//                 i++;
//             }
//             nums[i]=nums[j];
//         }
//         return i+1;
//     }

// }
// is code meant to remove duplicates from a sorted array in-place and return the new length.
// logic is to use two pointers, one for the current position and one for the next unique element.