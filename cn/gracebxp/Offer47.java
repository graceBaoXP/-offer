package cn.gracebxp;

/**
 * 不用加减乘除做加法
 *
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Offer47 {

    public static void main(String[] args){
        System.out.println(Add(2,4));
    }

    public static int Add(int num1,int num2) {
        return num2==0?num1:Add(num1^num2,(num1&num2)<<1);
    }

}
