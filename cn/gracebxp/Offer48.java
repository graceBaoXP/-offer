package cn.gracebxp;

/**
 * 把字符串转换成整数
 *
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class Offer48 {

    public static void main(String[] args){
        System.out.println(StrToInt("123654"));
    }

    public static int StrToInt(String str) {
        if(str==null||str.length()==0){
            return 0;
        }
        //定义一个标识符判定是否是负数
        boolean flag=str.charAt(0)=='-';
        int temp=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(i==0&&(c=='+'||c=='-')){
                continue;
            }
            //非法输入
            if(c<'0'||c>'9'){
                return 0;
            }
            temp=temp*10+(c-'0');
        }
        return flag?-temp:temp;
    }

}
