package com.algorigthms;

/**
 * 递归算法：例子
 * @package com.demo.recursion
 * @auther joker
 * @date 2018/4/26 18:05
 */
public class Recursion {

    /**
     * 阶乘运算
     * @param var
     * @return
     */
    public static int factorialNumber(int var) {
        if (1 == var) return 1;
        else if (0 == var) return 1;
        else return var * factorialNumber(var - 1);
    }

    /**
     * 阶乘运算使用迭代
     * @param var
     * @return
     */
    public static int factorialNumberUseFor(int var) {
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result = result * i;
        }
        return result;
    }

    public static int printFactorial(int var) {
        if (0 == var) return 0;
        System.out.println(var);
        return printFactorial(var - 1);
    }

    /**
     * 汉诺塔问题
     *
     * @param n      圆盘个数
     * @param begin  A 起始位置支柱
     * @param target B 目标位置
     * @param temp   C 辅助位置
     */
    public static void towersOfHanoi(int n, char begin, char target, char temp) {
        if (0 == n) {
            //System.out.println("只有一个圆盘，直接移动");
            return;
        }
        towersOfHanoi(n - 1, begin, temp, target);
        System.out.println("把第" + n + "圆盘从" + begin + "移动到" + target);
        towersOfHanoi(n - 1, temp, target, begin);
    }

    /**
     * 判断一个数组是否有序
     * 时间复杂度为O(n)空间复杂度O(n)，主要用于栈空间开销。
     * @param arr 数组
     * @param index 数组长度
     * @return
     */
    public static boolean isArrayIsSort(int[] arr, int index) {
        if (arr.length == 1) return true;
        if (index == 2) {
            return arr[index - 1] >= arr[index - 2];
        }
        return arr[index - 1] >= arr[index - 2] && isArrayIsSort(arr, index - 1);
//        return arr[index - 1] < arr[index - 2] ? false : isArrayIsSort(arr, index - 1);
    }
}