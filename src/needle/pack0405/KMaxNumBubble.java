package needle.pack0405;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Needle on 2017/4/5.
 * 求N个数中的第K大的数
 */
public class KMaxNumBubble {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字的总个数：");
        int numcount = sc.nextInt();

        System.out.println("请输入一系列待排序的数字：");
        ArrayList<Integer> list = new ArrayList<>();


        while (numcount-->0){
            list.add(sc.nextInt());
        }

        Integer[] arr = list.toArray(new Integer[list.size()]);
        System.out.println("你想知道第几个最大值？");
        int k = sc.nextInt();
        System.out.println("k="+k);

        //冒泡排序
        for (int i = 0 ; i<arr.length;++i){
            for (int j = i;j<arr.length-i-1;++j){
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        System.out.println("第k个最大值是："+arr[arr.length-k]);

    }

}
