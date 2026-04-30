package Java100;

import java.util.*;

import static java.lang.Integer.min;

public class Java_50 {
    /**
     * {@code 将一个整数数组中所有的0移动到数组末尾，保持其他元素的相对顺序}
     */
    public void Java41() {
        int[] arr = {1, 0, 0, 2, 3, 4, 0, 5, 0, 6};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * {@code 模拟电梯逻辑}
     */
    public void Java42() {

    }

    /**
     * {@code 找出数组中第一个重复出现的数字}
     */
    public void Java43() {
        int[] arr = {1, 2, 4, 3, 0, 2, 9};
        System.out.println("数组元素:" + Arrays.toString(arr));
        HashSet<Integer> site = new HashSet<>();
        boolean flag = false;
        int result = 0;
        for (int i : arr) {
            if (site.contains(i)) {
                flag = true;
                System.out.println("重复出现的数字为:" + i);
                break;
            } else {
                site.add(i);
            }
        }
        if (!flag) {
            System.out.println("无重复数字");
        }

    }

    /**
     * {@code 将用户输入的三个字符串按长度从短到长排序输出}
     */
    public void Java44() {
    }

    /**
     * {@code 将两个升序数组合并为一个新的升序数组}
     */
    public void Java45() {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int[] merge = new int[a.length + b.length];
        int k = 0;
        for (int j : a) {
            merge[k++] = j;
        }
        for (int j : b) {
            merge[k++] = j;
        }
        Arrays.sort(merge);
        System.out.println(Arrays.toString(merge));
    }

    /**
     * {@code 给定5x5的网格迷宫，0表示通路，1表示障碍，从左上角(0,0)到右下角(4,4)，判断是否存在一条通路}
     */
    public void Java46() {
        int[][] map = {{0, 1, 0, 0, 1}, {0, 0, 1, 1, 0}, {0, 1, 1, 0, 0}, {0, 0, 1, 0, 1}, {0, 0, 0, 0, 0}};
        System.out.println(canFindPath(0, 0, map));

    }

    /**
     * {@code 括号匹配检查}
     */
    public void Java47() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = sc.nextLine();
        System.out.println(isValid(s));
    }

    /**
     * {@code 将连续重复的字符用 字符+出现次数 表示}
     */
    public void Java48() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = sc.nextLine();
        if (s == null || s.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }
        // 处理最后一个字符
        sb.append(s.charAt(s.length() - 1));
        sb.append(count);
        System.out.println(sb.toString());

    }

    /**
     * {@code 模拟简单的计算器历史记录功能。用户可以连续进行多次计算，程序保留最后5次结果}
     */
    public void Java49() {
    }

    /**
     * {@code 找出两个字符串的最长公共前缀}
     */
    public void Java50() {
        String s1 = "12345defg";
        String s2 = "123";
        String[] strs = {s1, s2};
        String result = findCommonPrefix(strs);
        System.out.println(result);
    }

    private boolean canFindPath(int row, int col, int[][] map) {
        if (map.length == row ||
                map[0].length == col ||
                row < 0 ||
                col < 0 ||
                map[row][col] == 1) {
            return false;
        }
        if (map[row][col] == 0 && row == map.length - 1 && col == map.length - 1) {
            return true;
        }

        map[row][col] = 1;
        if (canFindPath(row + 1, col, map) ||
                canFindPath(row, col + 1, map) ||
                canFindPath(row, col - 1, map) ||
                canFindPath(row - 1, col, map)

        ) {
            return true;
        }
        return false;

    }

    private boolean isValid(String text) {
        Stack<Character> stack = new Stack<>();
        for (Character c : text.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private String findCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0||strs.length == 1) {
            return "";
        }
        int min_len = min(strs[0].length(),strs[1].length());
        int index = 0;
        for (int i = 0; i < min_len; i++) {
            if (strs[0].charAt(i) != strs[1].charAt(i)) {
                return strs[0].substring(0, i);
            }
            index++;
        }
        if (index < min_len) {
            return "";
        }else {
            return strs[0].substring(0, index);
        }

    }

}
