package javastudy0907;

import java.util.ArrayList;

public class AddressMain {

	public static void main(String[] args) {
		//Address ad1 = new Address("������", 62249, "01030302387");
		//Address ad2 = new Address("���ҿ�", 12345, "01012345678");
		//Address ad3 = new Address("������", 67890, "01087654321");
		//Address ad4 = new Address("�����", 15387, "01098765432");
		//Address ad5 = new Address("�Ÿ�ȣ", 31312, "01023456789");
		
		ArrayList<Address> adList = new ArrayList<Address>();
		adList.add(new Address("������", 62249, "01030302387"));
		adList.add(new Address("���ҿ�", 12345, "01012345678"));
		adList.add(new Address("������", 67890, "01087654321"));
		adList.add(new Address("�����", 15387, "01098765432"));
		adList.add(new Address("�Ÿ�ȣ", 31312, "01023456789"));
		
		
		for(int i=0;i<adList.size();i++) {
			String name = adList.get(i).getName();
			int mail=adList.get(i).getMail();
			String tel = adList.get(i).getTel();
			
			System.out.printf(i+1+". %s(%s) ������ : %d\n",name, tel,mail);
		}
		
		
		
		
	}

}
