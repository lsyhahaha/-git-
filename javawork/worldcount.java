import java.sql.SQLOutput;

public class worldcount {
    public static  void main(String[] args){
        int N = 100;
        int[] nums = new int[N];
        int[] arr = new int[N+1];

        for (int i = 0; i < N; i++) {
            nums[i] = (int)(Math.random()*100)+1;
            arr[nums[i]]++;
            //System.out.println(nums[i]);
        }

        int total = 0;
        for(int i = 0; i < N+1; i++){
            if (arr[i] == 0)
                continue;
            System.out.println("数字"+i+"出现了"+arr[i]+"次");
            total += arr[i];
            System.out.println(total);
        }
    }
}