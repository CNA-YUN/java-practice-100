package Java100;

import java.util.*;

public class Java_30 {
    /**
     * {@code 计算员工工资}
     */
    public void Java21() {

    }

    /**
     * {@code 模拟简单的登录系统，预设账号和密码，有三次尝试机会}
     */
    public void Java22() {
        String user = "admin";
        String password = "123456";

        System.out.println("请输入账号:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入密码:");
        String pwd = sc.nextLine();
        int cnt = 1;
        while (!name.equals(user) || !pwd.equals(password)) {
            if (cnt < 3) {
                System.out.printf("账号或密码错误,请重新输入,还有%d次机会\n", 3 - cnt);
                System.out.println("请输入账号:");
                name = sc.nextLine();
                System.out.println("请输入密码:");
                pwd = sc.nextLine();
                cnt++;
            } else {
                System.out.println("输入3次错误,系统已退出!");
                break;
            }
        }
        if (name.equals(user) && pwd.equals(password)) System.out.println("登录成功!");
    }

    /**
     * {@code 将一个整数数组中的所有元素向左移动一位}
     */
    public void Java23() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        System.out.println(Arrays.toString(nums));
    }

    /**
     * {@code 用户输入多个商品的价格，程序计算总价并打折}
     */
    public void Java24() {
    }

    /**
     * {@code 生成指定行数的金字塔图案}
     */
    public void Java25() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要生成的金字塔行数:");
        int n = sc.nextInt();
        char[][] arr = new char[n][2 * n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                arr[i][j] = ' ';
            }
        }
        int mid = (2 * n - 1) / 2;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 != 0) {
                arr[i][mid] = '*';
                for (int j = 2; j <= i; j += 2) {
                    arr[i][mid + j] = '*';
                    arr[i][mid - j] = '*';
                }
            } else {
                for (int j = 1; j <= i; j += 2) {
                    arr[i][mid - j] = '*';
                    arr[i][mid + j] = '*';
                }
            }
            System.out.println(arr[i]);
        }


    }

    /**
     * {@code 找出数组中的重复元素}
     */
    public void Java26() {
        int[] nums = {1, 2, 6, 2, 5, 8, 7, 8, 8, 1};
        HashMap<Integer, Integer> mapper = new HashMap<Integer, Integer>();
        System.out.println("重复的元素如下所示:");
        for (int num : nums) {
            if (!mapper.containsKey(num)) {
                mapper.put(num, 0);
            }else{
                if(mapper.get(num)==0){
                    mapper.put(num, mapper.get(num)+1);
                    System.out.print(num+" ");
                }

            }
        }
    }

    /**
     * {@code 检查指定座位是否被预定}
     */
    public void Java27() {

    }

    /**
     * {@code 模拟ATM取款功能，检查余额并进行取款}
     */
    public void Java28() {
    }

    /**
     * {@code 统计一段文本中不同长度单词的个数}
     */
    public void Java29() {
        System.out.println("请输入一段文本:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("[^A-Za-z\\s]","");
        String[] strs = str.split("\\s+");

        int maxlen = 0;
        for(String word:strs){
            if(word.length()>maxlen){
                maxlen = word.length();
            }
        }
        int[] nums = new int[maxlen];
        for (int i = 0; i < maxlen; i++) {
            nums[i] = 0;
        }
        for(String word:strs){
            nums[word.length()-1]++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                System.out.println("字母数为"+(i+1)+"个的单词有"+nums[i]+"个");
            }
        }


    }

    /**
     * {@code 猜数字游戏。随机生成1-100以内的数字，用户有7次机会猜}
     */
    public void Java30() {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int ans = random.nextInt(1,101);
        int cnt = 0;
        while (cnt < 7) {
            System.out.printf("你还有%d次机会，请输入你猜测的数字:%n", 7-cnt);
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num == ans) {
                System.out.println("你猜对了!");
                break;
            }
            else if (num > ans) {
                cnt++;
                System.out.println("你猜大了!");
            }
            else {
                cnt++;
                System.out.println("你猜小了!");
            }
        }
        if (cnt == 7) {
            System.out.println("你没有机会了!正确答案是:"+ans);
        }


    }
}
