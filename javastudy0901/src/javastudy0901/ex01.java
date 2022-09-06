package javastudy0901;

public class ex01 {

	public static void main(String[] args) {
		int [] a = {13,75,45,35,21,46,17,19};
		int max=0;
		for(int i = 0; i<a.length;i++) {
			max=Math.max(max, a[i]);
		}
		System.out.print("가장 큰 수는 : "+max);
	}

}
