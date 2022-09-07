package 배열연습;

public class ex01 {

	public static void main(String[] args) {
		String [] team = {"전수현","나소영","이혜빈","신명호","김명현"};
		String [] eat=new String[3];
		eat[0]="회";
		eat[1]="닭발";
		eat[2]="곱창";
		
		eat=team;
		eat[4]="참치회";
		
		for(String k : team) {
			System.out.println(k);
		}
		
		for(String k:eat) {
			System.out.println(k);
		}
		
		
		}

	}


