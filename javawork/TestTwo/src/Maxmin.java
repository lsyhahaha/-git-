import java.util.Random;

public class Maxmin{

    public static void main(String[] args){
        int N = 100;
        int[] nums = new int[N];
        Random random = new Random();

        int max = 0;
        int min = 100;
        System.out.println("随机数:");
        for (int i = 0; i < N; i++) {
            // 参数说明，bound表示生成的随机整数在0~bound之间，不包含bound
            nums[i] = random.nextInt(101);
            System.out.println(nums[i]);
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }

        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
    }
}