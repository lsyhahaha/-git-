public class Static {
	private static int number = 0;
	public Static() {
		++number;
	}
	public static void main(String[] args) {
		new Static();
		System.out.println("对象个数："+Static.number + "个");
	}

}