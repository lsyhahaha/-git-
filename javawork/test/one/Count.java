package test.one;

public class Count {
    public static void main(String[] args){
        int count = 0;
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++){
            nums[i] = i + 2;
            count += nums[i];
        }
        System.out.println("Count = "  +  count);
    }
}
