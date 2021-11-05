import java.util.Scanner;

public class isNotPrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n = input.nextInt();

        if (n == 0) {
            System.out.println(n + "不是素数");
            return;
        }

        int count = 0;
        for(int i = 2; i <= n/2;i++){
            if(n % i==0){
                count++;
                break;
            }
        }

        if(n != 1 && count==0){
            System.out.println(n + "是素数");
        }else{
            System.out.println(n + "不是一个质数!");
        }

    }
}