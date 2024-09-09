



class DuplicateNum{
    public static void main(String[] args) {

        int [] arr = {3,1,3,4,2};

        int ans = findDuplicate(arr);

        System.out.print(ans);
    }

    
    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){


            if(nums[i] != i+1){

            int correct = nums[i]-1;

                if(nums[i] != nums[correct]){
                swap(nums,i,correct);
                }

                else{

                    return nums[i];
                }

            }

            else{
                i++;
            }
        }
    return -1;
    }

    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}