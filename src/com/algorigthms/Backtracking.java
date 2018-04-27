package com.algorigthms;

/**
 * 回溯算法
 *
 * @package com.demo.recursion
 * @auther joker
 * @date 2018/4/26 18:18
 */
public class Backtracking {

    static int[] binary(int n) {
        int[] arr = new int[n];

        if (n < 1) {
            System.out.println();
        } else {
            arr[n - 1] = 0;
            binary(n - 1);
            arr[n - 1] = 1;
            binary(n - 1);
        }
        return arr;
    }

    public static void main(String[] args) {
//        int[] arr = binary(10);
//        for (int i=0;i<arr.length;i++)
//            System.out.println(arr[i]);
    }
}
