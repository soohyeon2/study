package javastudy0902;

public class ex02 {

	public static void main(String[] args) {
		int [][]array= new int[5][5];
		int k=1;
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array[i].length;j++) {
				array[i][j] = k;
				k++;
			}
		}
		
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
