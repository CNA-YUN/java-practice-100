package Java100;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Java_40 {
    /**
     * {@code 统计某一个字符串中特定字符的出现次数}
     */
    public void Java31() {

    }

    /**
     * {@code 计算整数数组的平均值}
     */
    public void Java32() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average is " + average);

    }

    /**
     * {@code 将一个字符串中的小写字母转换为大写字母}
     */
    public void Java33() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an String: ");
        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result.append((char) (c - 32));
        }
        System.out.println("Result: " + result);
    }

    /**
     * {@code 将一个整数数组倒序输出}
     */
    public void Java34() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }

    /**
     * {@code 用户选择饮料编号，程序输出选择的饮料}
     */
    public void Java35() {
    }

    /**
     * {@code 输出从1到n之间所有奇数的平方}
     */
    public void Java36() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i += 2) {
            list.add(i * i);
        }
        System.out.println(list);
    }

    /**
     * {@code 统计用户输入的6个整数中有多少个正数和负数}
     */
    public void Java37() {

    }

    /**
     * {@code 剪刀石头布游戏}
     */
    public void Java38() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("剪刀石头布游戏");
        System.out.println("===============");
        System.out.println("石头：1");
        System.out.println("剪刀：2");
        System.out.println("布：3");
        System.out.println("请输入你的选择:");
        int x = sc.nextInt();
        int y = random.nextInt(1, 4);
        System.out.println("电脑出：" + y);
        switch (y) {
            case 1:
                if (x == 1) {
                    System.out.println("平局");

                } else if (x == 2) {
                    System.out.println("你输了");

                } else {
                    System.out.println("你赢了");
                }
                break;
            case 2:
                if (x == 1) {
                    System.out.println("你赢了");

                } else if (x == 2) {
                    System.out.println("平局");

                } else {
                    System.out.println("你输了");
                }
                break;
            case 3:
                if (x == 1) {
                    System.out.println("你输了");

                } else if (x == 2) {
                    System.out.println("你赢了");

                } else {
                    System.out.println("平局");
                }
                break;
        }
    }

    /**
     * {@code 找出数组中第二大的数}
     */
    public void Java39() {

    }

    /**
     * {@code 判断一个字符串是否是另一字符串的子串}
     */
    public void Java40() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Main String: ");
        String s = sc.nextLine();
        System.out.println("Enter Pattern String: ");
        String p = sc.nextLine();
        boolean match = false;
        for (int i = 0; i < s.length(); i++) {
            for(int j = 0; j < p.length(); j++) {
                if(s.charAt(i+j) != p.charAt(j)) {
                    match = false;
                    break;
                }else{
                    match = true;
                }
            }
            if(match) {
                break;
            }
        }
        if (match){
            System.out.println("Match");
        }else{
            System.out.println("Not Match");
        }
    }
}
