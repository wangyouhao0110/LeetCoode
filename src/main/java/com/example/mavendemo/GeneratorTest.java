package com.example.mavendemo;


import java.util.Arrays;

import static org.apache.commons.lang3.ArrayUtils.swap;

public class GeneratorTest {
    public static void main(String[] args) {
        int testTimes = 5000; // 测试次数
        int maxSize = 100; // 数组最大长度 100
        int maxValue = 100; // 数组最大值 100
//        for (int i = 0; i < testTimes; i++) {
//            int[] arrs1 = generateRandomArray(maxSize, maxValue);
//            int[] arrs2 = copyArray(arrs1);
//            Arrays.sort(arrs1);     // 使用系统自带排序
//            heapSort(arrs2);    // 自己写的排序方法
//            if (!isEquals(arrs1, arrs2)) {
//                System.out.println("两次结果不相同");
//                break;
//            }
//        }
        int[] res = {1,4,2,3,5,4,1,3,4,1234,124,124,4,111,1,1,1,1,4};
        System.out.println(Arrays.toString(res));
    }

    // 生成 长度随机、最大值随机的数组
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        // Math.random() -> [0,1) 所有小数
        // Math.random * N -> [0,N) 所有小数
        // (int)(Math.random * N) -> [0, N) 所有整数

        // 生成一个大小为 [0, maxSize]的数组
        int[] arrs = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arrs.length; i++) {
            // [0, maxValue] - [0, maxValue - 1]  数组上的数也随机(可能需要负数)
            arrs[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arrs;
    }

    // 复制测试数组
    private static int[] copyArray(int[] arrs1) {
        if (arrs1.length == 0) return null;
        int[] res = new int[arrs1.length];
        for (int i = 0; i < arrs1.length; i++) {
            res[i] = arrs1[i];
        }
        return res;
    }

    // 判断排序后两数组是否相同
    public static boolean isEquals(int[] arrs1, int[] arrs2) {
        if (arrs1.length != arrs2.length) return false;
        for (int i = 0; i < arrs1.length; i++) {
            if (arrs1[i] != arrs2[i]) return false;
        }
        return true;
    }
}
