package cn.gracebxp;

/**
 * 构建乘积数组
 *
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class Offer50 {

    public static int[] multiply(int[] A) {
        int length=A.length;
        int[] B=new int[length];
        //从左至右连乘
        for (int i=0,pro=1;i<length;i++){
                B[i]=pro;
                pro *=A[i];
        }
        //从右至左连乘
        for(int i=length-1,pro=1;i>=0;i--){
            B[i] *=pro;
            pro *=A[i];
        }
        return B;
    }


}
