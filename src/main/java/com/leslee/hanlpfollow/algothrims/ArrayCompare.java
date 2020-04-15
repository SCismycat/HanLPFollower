package com.leslee.hanlpfollow.algothrims;

/**
 * @author: Leslee
 * @create: 2020-04-15 23:14
 **/
public class ArrayCompare {

    /*
    比较两个数组
     */
    public static int compare(Long[] arrayA,Long[] arrayB){
        int len1 = arrayA.length;
        int len2 = arrayB.length;
        int lim = Math.min(len1,len2);
        int k = 0;
        while (k<lim){
            Long c1 = arrayA[k];//第一个的值
            Long c2 = arrayB[k];
            if (!c1.equals(c2)){
                //返回值是整型，它是先比较对应字符的大小(ASCII码顺序)，如果第一个字符和参数的第一个字符不等，结束比较，返回他们之间的**差值**，
                // 如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，以此类推,直至比较的字符或被比较的字符有一方结束。
                //如果参数字符串等于此字符串，则返回值 0；
                //如果此字符串小于字符串参数，则返回一个小于 0 的值；
                //如果此字符串大于字符串参数，则返回一个大于 0 的值。
                return c1.compareTo(c2);//返回两者之间的差值,如果a<b 则返回负数,如果a>b,则返回正数
            }
            ++k;
        }
        return len1 - len2;
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
        int res = compare(array1,array2);
        System.out.println(res);
    }

}
