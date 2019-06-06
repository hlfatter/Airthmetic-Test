import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 根据所给的数字target 判断其是有数组中哪两个数字和组成 输出这两个数字的索引
 */


public class Demo {
    public static void main(String[] args) {
        int[] array = new int[2];
        int[] arr = {3, 2, 4, 3};
        Scanner sc = new Scanner(System.in);
        System.out.println("please input:");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    array[0] = i;
                    array[1] = j;
                    System.out.println(Arrays.toString(array));
                    return;
                }else{
                    return;
                }
            }
        }


//        Map map = new HashMap();
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i],i);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if(map.containsKey(num-arr[i]) && map.get(num-arr[i]) != (Object) i){
//                System.out.println(i + (int)map.get(num-arr[i]));
//            }
//        }


    }
}
