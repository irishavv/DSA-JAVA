package companyPractice;

public class AbsoluteDistinct {
    public static void main(String[] args){
        int[] nums = {-4, -4, -3, -3, -1, 0, 1, 2, 3, 3, 4};

        int result = count(nums);
        System.out.println(result);
    }

    static int count(int[] nums){
        int i = 0;
        int j = nums.length-1;
        int prev = Integer.MIN_VALUE;
        int next = Integer.MAX_VALUE;
        int count= 0;
        while(i <= j){
            if(Math.abs(nums[i]) == Math.abs(nums[j])){
                if(nums[i] != prev && nums[j]  != next ) {
                    count++;
                }
                prev = nums[i];
                next = nums[j];
                i++;
                j--;
            } else if (Math.abs(nums[i]) < Math.abs(nums[j])) {
                if(nums[j] != next){
                    count++;
                }
                next = nums[j];
                j--;

            }else{
                if(nums[i] != prev){
                    count++;
                }
                prev = nums[i];
                i++;
            }

        }
        return count;
    }
}
