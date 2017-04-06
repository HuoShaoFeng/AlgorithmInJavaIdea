package needle.pack0405;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created by Needle on 2017/4/6.
 * 数组法求取N个数组成的数组的第k大的数
 */
public class KMaxNumArray {
    public static void main(String[] args){
        System.out.println("请输入数字的个数：");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.println("请输入这"+count+"个数字：");
        int[] arr = new int[count];
        int index = 0;
        while (count-->0){
            arr[index++]=sc.nextInt();
        }
        System.out.println("你想求第几个最大值？");
        int kmax = sc.nextInt();
        int[] retArr = new int[kmax];
        for (int i = 0;i<kmax;++i){
            retArr[i]=arr[i];
        }

        Arrays.sort(retArr);//升序排序


        for (int i = kmax;i<count;++i){
            //Arrays.binarySearch(数组名，值)
            //这个方法的优点在于，如果找到了指定的元素，则返回其下标的位置，如果找不到，则返回 应该插入的位置的负数再 -1
            // （减1的目的是防止出现-0），我们可以据此推算出应该插入的位置。
            int ij = Arrays.binarySearch(retArr,arr[i]);//二分查找，给予有序的
            if(ij<0) {//retArr中没有这个值:-(ij+1)就是应该插入的位置
                for (int j = 0; j < -(ij + 1) - 1; j++) {
                    retArr[j] = retArr[j + 1];
                }
                retArr[-(ij + 1) - 1] = arr[i];
            }
        }

        System.out.println("the kmax num is : "+retArr[0]);
    }
}
