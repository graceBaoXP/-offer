package cn.gracebxp;

/**
 * 替换空格
 *
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Offer2 {

    public String replaceSpace(StringBuffer str) {
        int index=str.length()-1;
        for(int i=0;i<=index;i++){
            if (str.charAt(i)==' '){
                str.append("  ");
            }
        }

        int index2=str.length()-1;
        while (index<=index2&&index>=0){
           char c=str.charAt(index--);
           if (c==' '){
               str.setCharAt(index2--,'0');
               str.setCharAt(index2--,'2');
               str.setCharAt(index2--,'%');
           }else{
               str.setCharAt(index2--,c);
           }
        }
        return str.toString();
    }
}
