package �迭����;

public class ex01 {

	public static void main(String[] args) {
		String [] team = {"������","���ҿ�","������","�Ÿ�ȣ","�����"};
		String [] eat=new String[3];
		eat[0]="ȸ";
		eat[1]="�߹�";
		eat[2]="��â";
		
		eat=team;
		eat[4]="��ġȸ";
		
		for(String k : team) {
			System.out.println(k);
		}
		
		for(String k:eat) {
			System.out.println(k);
		}
		
		
		}

	}


