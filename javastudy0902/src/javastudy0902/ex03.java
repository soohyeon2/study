package javastudy0902;

public class ex03 {

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
			if(i%2==1) {
				for (int j=array[i].length-1;j>=0;j--) {
					System.out.print(array[i][j]+"\t");
				}
				
			}
			else {
				for (int j=0;j<array[i].length;j++) {
					System.out.print(array[i][j]+"\t");
				}
			}
			System.out.println();
		}

	}

}
