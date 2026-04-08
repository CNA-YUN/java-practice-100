package Java100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.math.BigInteger;

/**
 * {@code java题目1-10}
 */
public class Java_10 {
    public void Java01() {
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> nums = new ArrayList<>();
        for (int a : arr) {
            for (int b : arr) {
                if (a == b) {
                    continue;
                }
                for (int c : arr) {
                    if (a == c || b == c) {
                        continue;
                    }
                    nums.add(a * 100 + b * 10 + c);
                }
            }
        }
        System.out.println("共有" + nums.size() + "个三位数");
        System.out.println(nums);
    }

    public void Java02() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 2000; i <= 3200; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                nums.add(i);
            }
        }
        System.out.println(nums);
    }

    public void Java03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数x:");
        int x = sc.nextInt();
        System.out.println("请输入第二个整数y:");
        int y = sc.nextInt();
        System.out.println("请输入第三个整数z:");
        int z = sc.nextInt();

        int[] arr = {x, y, z};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * {@code 计算一行字符中的字母，数字，空格数量}
     */
    public void Java04() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符:");
        String s = sc.nextLine();
        int lettercout = 0;
        int digitcout = 0;
        int spacecout = 0;
        int othercout = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                lettercout++;
            } else if (Character.isDigit(c)) {
                digitcout++;
            } else if (Character.isSpaceChar(c)) {
                spacecout++;
            } else {
                othercout++;
            }

        }
        System.out.println("英文字母：" + lettercout + "个");
        System.out.println("数字：" + digitcout + "个");
        System.out.println("空格：" + spacecout + "个");
        System.out.println("其他字符：" + othercout + "个");

    }

    public void Java05() {
        BigInteger total = BigInteger.ZERO;
        for (int i = 1; i <= 20; i++) {
            total = total.add(factorial(i));
        }
        System.out.println(total);
    }

    /**
     * {@code 递归逆序输出字符串}
     */
    public void Java06() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入5个字符:");
        String s = sc.nextLine();
        String data = s.length() > 5 ? s.substring(0, 5) : s;
//        递归，倒序输出
        printReverseString(data.toCharArray(), 0);

    }

    /**
     * {@code 判断回文数 }
     */
    public void Java07() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        String s = sc.nextLine().trim();
        char[] chars = s.toCharArray();
        int low = 0, high = chars.length - 1;
        while (low < high) {
            if (chars[low] != chars[high]) {
                System.out.println("False");
                return;
            }
            low++;
            high--;
        }
        System.out.println("True");
        return;

    }

    public void Java08() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int x = sc.nextInt();
        String grade = x >= 90 ? "A" : (x >= 80 ? "B" : "C");
        System.out.println("等级:" + grade);
    }

    /**
     * {@code 华氏度转摄氏度}
     */
    public void Java09() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入华氏度:");
        double x = sc.nextDouble();
        double result = (x - 32) * 5 / 9;
        String res = String.format("%.2f", result);
        System.out.println("华氏度: " + x + " E");
        System.out.println("摄氏度: " + res + " C");
    }

    /**
     * {@code 闰年判断器}
     */
    public void Java10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(true);
            }
            else System.out.println(year % 400 == 0);
        }
        else {
            System.out.println(false);
        }
    }

    /**
     * {@code 计算n!}
     */
    private BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    /**
     * {@code 递归函数}
     */
    private void printReverseString(char[] chars, int id) {
        if (id >= chars.length) {
            return;
        }
        printReverseString(chars, id + 1);
        System.out.print(chars[id]);
    }

}
