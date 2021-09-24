import java.util.Scanner;

public class abastring {
    public  static void main (String[] args){
        System.out.print("请输入一个字符串:");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int n = s.length();
        int i = 0, j = n-1;
        boolean flag = true;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }else{
                flag = false;
                break;
            }
        }
        System.out.println(flag);

    }
}
