import java.util.LinkedList;

public class linkedList_stack {
    public static void main(String[] args) {
        //用linkedlist实现栈
        LinkedList school=new LinkedList();
        school.push("武汉轻工大学");//入栈
        school.push("武汉大学");//入栈
        school.push("武汉理工大学");//入栈
        System.out.println(school.pop());//出栈
        school.push("华中科技大学");//入栈
        school.push("华中师范大学");//入栈
        System.out.println(school.pop());//出栈
        System.out.println(school.pop());//出栈
        System.out.println(school);
    }
}