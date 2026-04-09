package Java100;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/**
 * {@code java练习题11-20题}
 */
public class Java_20 {
    /**
     * {@code 递归求5!}
     */
    public void Java11() {
        System.out.println(fact(5));
    }

    /**
     * {@code 递归求第5个人的年龄}
     */
    public void Java12() {
        System.out.println("第5个人的年龄是: " + guessAge(5) + "岁");
    }

    /**
     * {@code 给一个n位整数，判断它的位数，并逆序打印各位数字}
     */
    public void Java13() {
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        StringBuilder ans = new StringBuilder();
        while (a != 0) {
            cnt++;
            ans.append(a % 10);
            a = a / 10;
        }
        System.out.println("整数的位数为: " + cnt);

        System.out.println("逆序输出: " + ans);
    }

    /**
     * {@code 模拟简单计算机，实现加减乘除四则运算}
     */
    public void Java14() {
        System.out.println("请输入第一个数字:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("请输入运算符:");
        char ch = sc.next().charAt(0);
        System.out.println("请输入第二个数字");
        double b = sc.nextDouble();
        switch (ch) {
            case '/':
                if (b == 0) {
                    System.out.println("除数不能为0!");

                } else {
                    System.out.println("result: " + (a / b));

                }
                break;
            case '+':
                System.out.println("result: " + (a + b));
                break;
            case '-':
                System.out.println("result: " + (a - b));
                break;
            case '*':
                System.out.println("result: " + (a * b));
                break;
            default:
                System.out.println("请输入正确的运算符!");
                break;
        }
    }

    /**
     * {@code 将十进制数转换为二进制数}
     */
    public void Java15() {
        System.out.println("请输入一个十进制数:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = x;
//        int cnt=0;
        Stack<Integer> stack = new Stack<>();
        while (n != 0) {
            stack.push(n % 2);
            n /= 2;
        }
//        System.out.println("转换为二进制数为: " + stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    /**
     * {@code 找出100以内的所有完数（完数：一个数等于它的因子之和，eg:6=1+2+3）}
     */
    public void Java16() {
        for (int i = 2; i < 101; i++) {
            int cnt = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    cnt = cnt + j;
                }
            }
            if (cnt == i) {
                System.out.println(i);
            }
        }
    }

    /**
     * {@code 冒泡排序}
     */
    public void Java17() {
        int[] a = {45, 32, 7, 4, 90, 23, 54, 123, 87};
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {// 交换元素
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    /**
     * {@code 统计一段文本中元音字母出现的次数}
     */
    public void Java18() {
        System.out.println("请输入一段文本:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        char[] ch = s.toCharArray();
        int cnt = 0;
        for (char c : ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt++;
            }
        }
        System.out.println("元音字母出现的次数为: " + cnt);
    }

    /**
     * {@code 生成指定长度的密码，包含字母和数字}
     */
    public void Java19() {
        System.out.println("请输入生成密码的长度:");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String password = generateRandomPassword(len);
        System.out.println("密码为: " + password);
    }

    /**
     * {@code 验证电子邮箱格式是否正确(简单验证：确定包含@和.符号，且.在@之后)}
     */
    public void Java20() {
        System.out.println("请输入邮箱地址:");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        int idx = email.indexOf("@");
        int idx2 = email.indexOf(".");
        if (idx != -1 && idx2 != -1) {
            System.out.println(idx < idx2);
        } else {
            System.out.println(false);
        }
    }

    private int fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }

    private int guessAge(int n) {
        if (n == 1) return 10;
        else {
            return 2 + guessAge(n - 1);
        }
    }

    private String generateRandomPassword(int len) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < len; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }
        return password.toString();
    }
}
