public class PrintStarTwo{
	public static void main(String[] args){
		for (int i = 0; i <= 10; i++){
			int count = 10-i;
			while (count != 0){
				System.out.print("*");
				count--;
			}
			if (i == 10) break;
			System.out.println("");
		}
	}
}