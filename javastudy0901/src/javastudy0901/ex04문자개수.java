package javastudy0901;

import java.util.Arrays;

public class ex04문자개수 {
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
	    System.out.println("A의 개수 : "+cntA);
	    System.out.println("B의 개수 : "+cntB);
	    System.out.println("C의 개수 : "+cntC);
	    System.out.println("D의 개수 : "+cntD);
	    System.out.println("F의 개수 : "+cntF);
		
	}
}
