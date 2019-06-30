package cn.gracebxp;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 */
public class Offer8 {
    public int JumpFloor(int target) {
        if(target<=2){
            return target;
        }

        int pre2=1,pre1=2;
        int result=1;
        for ( int i=2;i<target;i++){
            result=pre1+pre2;
            pre2=pre1;
            pre1=result;
        }
        return result;
    }

}
