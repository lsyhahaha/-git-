public class PrintStarOne{
	public static void main (String[] args){
		for (int i = 0; i <= 7; i++){
			int xCount = Math.abs(7-2*i);
			int yCount = (7-xCount)/2;
			//System.out.println(xCount);
			//System.out.println(yCount);
			while (yCount != 0){
				//打印星星前面的空格
				System.out.print(" ");
				yCount--;
			}

			while (xCount != 0){
				//打印空格
				System.out.print("*");	
				xCount--;
			}			

			while (yCount != 0){
				//打印星星后面的空格
				System.out.print(" ");
				yCount--;
			}
			//换行
			System.out.println("");
		}
		System.out.println("啊");
	}
}