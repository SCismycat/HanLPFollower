package com.leslee.hanlpfollow.algothrims;

import java.util.TreeSet;

/**
 * 求集合中最相近的两个数
 * @author: Leslee
 * @create: 2020-04-15 23:23
 **/
public class ArrayDistance {

    public static Long computeMinimumDistance(TreeSet<Long> setA,TreeSet<Long> setB){
        Long[] arrayA = setA.toArray(new Long[0]);
        Long[] arrayB = setB.toArray(new Long[0]);
        return computeMinimumDistance(arrayA,arrayB);
    }

    public static Long computeMinimumDistance(Long[] arrayA,Long[] arrayB){
        int aIndex = 0;
        int bIndex = 0;
        long min = Math.abs(arrayA[0]-arrayB[0]);//计算两个数组第一位的绝对值;
        while (true){
            //如果a<b
            if (arrayA[aIndex] > arrayB[bIndex]){
                //b的索引增加
                bIndex++;
            }else{
                aIndex++;
            }

            if (aIndex>=arrayA.length || bIndex>=arrayB.length){
                break;
            }
            if (Math.abs(arrayA[aIndex]-arrayB[bIndex])<min){
                min = Math.abs(arrayA[aIndex] - arrayB[bIndex]);
            }
        }
        return min;
    }

    //计算平均距离
    public static Long computeAverageDistance(Long[] arrayA,Long[] arrayB){
        Long totalA = 0L;
        Long totalB = 0L;
        for (Long a:arrayA){
            totalA +=a;
        }
        for (Long b:arrayB){
            totalB += b;
        }
        return Math.abs(totalA/arrayA.length - totalB/arrayB.length);
    }

    public static void main(String[] args) {
        Long[] array1 = new Long[3];
        array1[0] = 1L;
        array1[1] = 2L;
        array1[2] = 5L;
        Long[] array2 = new Long[4];
        array2[0] = 1L;
        array2[1] = 2L;
        array2[2] = 5L;
        array2[3] = 9L;
        Long result = computeMinimumDistance(array1,array2);
        System.out.println(result);
    }


}
