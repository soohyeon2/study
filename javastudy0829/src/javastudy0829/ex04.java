package javastudy0829;

public class ex04 {

	public static void main(String[] args) {
		//1~100까지 3의 배수만 출력하세요. 
		//3의 배수합 출력
		int sum=0;
		for(int i =1;i<101;i++) {
			if(i%3==0) {
				System.out.print(i + " ");
				sum+=i;
			}
			if(i==51) {
				System.out.println();
			}
			
		}
		System.out.println();
		System.out.println(sum);
	}

}
