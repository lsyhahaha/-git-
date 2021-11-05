public class Factory{
    public static int fac(int n){
        int res = 1;
        for (int i = 1; i < n+1; i++){
            res = res * i;
        }
//        System.out.println("res = " + res);

        return res;
    }

    public static void main(String[] args){
        Factory a = new Factory();
        System.out.println("2的阶乘：" + fac(2));
        System.out.println("4的阶乘：" + fac(4));
        System.out.println("6的阶乘：" + fac(6));
        System.out.println("8的阶乘：" + fac(8));
        System.out.println("10的阶乘：" + fac(10));
    }
}