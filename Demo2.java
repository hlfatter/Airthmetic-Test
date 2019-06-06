import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("please input:");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(chars[i]);
            for (int j = i+1; j < chars.length; j++) {
                if(sb.indexOf(String.valueOf(chars[j])) < 0) {
                    sb.append(chars[j]);
                }else {
                    break;
                }
            }
            list.add(sb.length());
        }
        System.out.println( Collections.max(list));
    }
}
