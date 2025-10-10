// code 496
/* 
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;

        int []arr=new int[n];
        for(int i=0;i<nums1.length;i++){
            int bda = -1;
                boolean milgya= false;
            for(int j=0;j<nums2.length;j++){
                
                if(nums1[i]==nums2[j]){
                    milgya =true;
                }
                if(milgya && nums2[j]>nums1[i]){
                    bda=nums2[j];
                    break;
                }
            }
             arr[i]=bda;
            }
             return arr;
        }
         
    }
        agr nums1 ka element nums2 m nhi h to -1 return krdo
   jaha phli array ka element dusri array m mile yaha milgya ko true krdo or fir check kro ki dusri  ki iske age koi bda element h ya nhi
    agr h to usko bda m store krdo or break krdo loop ko
        */