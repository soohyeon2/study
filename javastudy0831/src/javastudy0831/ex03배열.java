package javastudy0831;


public class ex03�迭 {

	public static void main(String[] args) {
		// �迭 : �������� ������(���� Ÿ��)�� �ϳ��� ��� ���� �ϴ°�!
		
		int num1=10;
		int num2=20;
		int num3=30;
		int num4=40;
		
		int [] numArray=new int[4];
		
		numArray[0]=num1;
		numArray[1]=num2;
		numArray[2]=num3;
		numArray[3]=num4;
		
		//System.out.println(numArray[2]);
		
		int [] numArray2= {50,60,70,80};
		
		for(int i=0;i<numArray2.length;i++) {
			System.out.println(numArray2[i]);
		}

	}

}
