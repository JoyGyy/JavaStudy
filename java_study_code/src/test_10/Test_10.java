package test_10;

import java.util.*;

public class Test_10 {
    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 洗牌算法shuffle可以随机交换List中的元素位置:
        Collections.shuffle(list);
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    static int findMissingNumber(int start, int end, List<Integer> list) {
        boolean exist = false;
        for (int i = start; i <= end; i++) {
            for (Integer n : list) {
                if (i == n) {
                    exist = true;
                }
            }
            if (exist) {
                exist = false;
            } else {
                return i;
            }
        }
        return 0;
    }
}