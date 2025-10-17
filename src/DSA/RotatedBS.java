package DSA;

public class RotatedBS {
    public static void main(String[] args){
        int[] arr = {5,6,7,8,0,1,2,3,4};
        int target = 1;
        System.out.println(search(arr, target));
    }


    static int search(int[] nums , int target){
        int pivot = Searchpivot(nums);
        if(pivot == -1){
            return Binarysearch(nums,target,0,nums.length-1 );
        }
        else if(nums[pivot] == target){
            return pivot;
        } else if (target >= nums[0]) {
            return Binarysearch(nums, target, 0,pivot-1);
        }else{
            return Binarysearch(nums,target,pivot+1, nums.length-1);
        }
    }

    static int Binarysearch(int[] arr,int target,int start , int end){
            while(start<= end){
                int mid = start + (end - start)/2;
                if(arr[mid] > target){
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        return -1;
    }

    static int Searchpivot(int[] arr){
        int start = 0;
        int end = arr.length-1 ;

        while(start <= end ){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid] <= arr[start]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;

    }
}
