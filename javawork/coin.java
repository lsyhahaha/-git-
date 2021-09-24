import java.util.Scanner;


public class coin {
    static int  Nub (double money, double coin) {
        int n = 0;
        while (money >= coin) {
            n++;
            money = money - coin;
        }

        return n;
    }

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0;
        System.out.print("请输入人命币金额（元,最小位为分）：");
        Scanner scan = new Scanner(System.in);
        double money = scan.nextDouble();

        a = Nub(money, 1);
        money = money - a*1;
        System.out.println(money);
        b = Nub(money,0.2);
        money = money - b*0.2;
        System.out.println(money);
        c = Nub(money, 0.05);
        money = money - c*0.05;
        System.out.println(money);
        d = Nub(money, 0.01);
        money = money - d*0.01;
        System.out.println(money);

        System.out.format("需要%d个硬币", a+b+c+d);
    }
}
