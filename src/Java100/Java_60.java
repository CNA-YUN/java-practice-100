package Java100;

import java.util.*;

import static java.lang.Math.*;


public class Java_60 {
    /**
     * {@code 用户输入一个句子，程序将每个单词反转，但保持单词顺序不变}
     */
    public void Java51() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder temp = new StringBuilder(words[i]);
            temp.reverse();
            builder.append(temp);
            if (i != words.length - 1) {
                builder.append(" ");
            }
        }
        System.out.println(builder.toString());
    }

    /**
     * {@code 数组中每个元素出现两次，找出只出现一次的元素}
     */
    public void Java52() {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        map.forEach((k, v) -> {
                    if (v == 1) {
                        System.out.println(k);
                    }
                }
        );
    }

    /**
     * {@code 检查两个字符串是否为字母异位词}
     */
    public void Java53() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word1:");
        String word1 = sc.nextLine();
        System.out.println("Enter word2:");
        String word2 = sc.nextLine();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            if (map1.containsKey(word1.charAt(i))) {
                map1.put(word1.charAt(i), map1.get(word1.charAt(i)) + 1);
            } else {
                map1.put(word1.charAt(i), 1);
            }
        }
        for (int i = 0; i < word2.length(); i++) {
            if (map2.containsKey(word2.charAt(i))) {
                map2.put(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
            } else {
                map2.put(word2.charAt(i), 1);
            }
        }
        System.out.println(map1.equals(map2));

    }

    /**
     * {@code 连续子数组的最大和}
     */
    public void Java54() {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        int currentmax = numbers[0];// 以当前元素结尾的最大子数组和
        int resultmax = numbers[0];// 全局最大子数组和

        for (int i = 1; i < numbers.length; i++) {
            // 要么继续扩展现有子数组，要么从 i 重新开始
            currentmax = max(currentmax + numbers[i], numbers[i]);
            // 更新全局最优解
            resultmax = max(resultmax, currentmax);
        }
        System.out.println(resultmax);
    }

    /**
     * {@code 统计每个字符出现的次数}
     */
    public void Java55() {

    }

    /**
     * {@code 电梯调度系统}
     */
    public void Java56() {
    }

    /**
     * {@code 相邻元素的最大差值}
     */
    public void Java57() {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        if (numbers.length <= 1) {
            return;
        }
        int resultmax = 0;
        for (int i = 1; i < numbers.length; i++) {
            resultmax = max(abs(numbers[i] - numbers[i - 1]), resultmax);
        }
        System.out.println(resultmax);
    }

    /**
     * {@code 数独行列检查器}
     */
    public void Java58() {
        int[][] board = {
                {1, 2, 3, 4},
                {2, 3, 4, 1},
                {3, 4, 1, 2},
                {4, 1, 2, 3}
        };
        System.out.println(isValidBoard(board));

    }

    /**
     * {@code 3X3矩阵加法}
     */
    public void Java59() {
    }

    /**
     * {@code 输入一个数字的平方，平方运算小于50则退出}
     */
    public void Java60() {
    }

    private boolean isValidBoard(int[][] board) {
        // 假设 board 不为 null，且为矩形
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        int rows = board.length;
        int cols = board[0].length;

        // 检查每行
        for (int i = 0; i < rows; i++) {
            boolean[] seen = new boolean[5]; // 下标 1~4 表示数字是否出现过
            for (int j = 0; j < cols; j++) {
                int val = board[i][j];
                if (val < 1 || val > 4) {   // 非法数字
                    return false;
                }
                if (seen[val]) {             // 重复数字
                    return false;
                }
                seen[val] = true;
            }
            // 检查是否 1~4 都出现过（如果每行恰好 4 个格子，则上面循环已确保）
            // 但如果格子数可能多于 4，需要额外检查
            for (int k = 1; k <= 4; k++) {
                if (!seen[k]) return false;
            }
        }

        // 检查每列
        for (int j = 0; j < cols; j++) {
            boolean[] seen = new boolean[5];
            for (int i = 0; i < rows; i++) {
                int val = board[i][j];
                if (val < 1 || val > 4) {
                    return false;
                }
                if (seen[val]) {
                    return false;
                }
                seen[val] = true;
            }
            for (int k = 1; k <= 4; k++) {
                if (!seen[k]) return false;
            }
        }

        return true;
    }
}
