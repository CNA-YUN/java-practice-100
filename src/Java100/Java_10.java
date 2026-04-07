package Java100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * &#064;Description:java题目1-10
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

        int [] arr = {x, y, z};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void Java04() {

    }

    public void Java05() {
    }

    public void Java06() {
    }

    public void Java07() {
    }

    public void Java08() {
    }

    public void Java09() {
    }

    public void Java10() {
    }
}
