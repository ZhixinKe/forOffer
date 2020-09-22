package leetCode.数组;
/*
    描述：请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class Solution5 {

    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char x: s.toCharArray()) {
            if (x==' '){
                sb.append("%20");
            }
            sb.append(x);
        }
        return sb.toString();
    }
}
