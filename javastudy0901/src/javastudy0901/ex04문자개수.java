package javastudy0901;

import java.util.Arrays;

public class ex04���ڰ��� {
	public static void main(String[] args) {
		String score="A,A,B,C,D,A,C,D,D,D,F";
	    String [] arr = score.split(",");
	    
	    System.out.println(Arrays.toString(arr));
	    
	    int cntA=0;
	    int cntB=0;
	    int cntC=0;
	    int cntD=0;
	    int cntF=0;
	    
	    for (int i=0;i<arr.length;i++) {
	    	switch (arr[i]) {
			case "A":
				cntA++;
				break;
			case "B":
				cntB++;
				break;
			case "C":
				cntC++;
				break;
			case "D":
				cntD++;
				break;
			case "F":
				cntF++;
				break;

			default:
				break;
			}
	    	
	    	
	    }
	    System.out.println("A�� ���� : "+cntA);
	    System.out.println("B�� ���� : "+cntB);
	    System.out.println("C�� ���� : "+cntC);
	    System.out.println("D�� ���� : "+cntD);
	    System.out.println("F�� ���� : "+cntF);
		
	}
}
