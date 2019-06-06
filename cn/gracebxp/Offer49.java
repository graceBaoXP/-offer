package cn.gracebxp;

/**
 * 数组中重复的数字
 *
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class Offer49 {

    public static void main(String[] args){
        int[] numbers={2,4,2,5,6};
        int[] duplication=new int[numbers.length];
        System.out.println(duplicate(numbers,5,duplication));
    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {
            if (numbers==null||numbers.length==0){
                return false;
            }
            for(int i=0;i<numbers.length;i++){
                while (numbers[i]!=i){
                    if (numbers[i]==numbers[numbers[i]]){
                        duplication[0]=numbers[i];
                        return true;
                    }
                    swap(numbers,i,numbers[i]);
                }
            }
            return false;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
