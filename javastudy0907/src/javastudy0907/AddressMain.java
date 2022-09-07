package javastudy0907;

import java.util.ArrayList;

public class AddressMain {

	public static void main(String[] args) {
		//Address ad1 = new Address("전수현", 62249, "01030302387");
		//Address ad2 = new Address("나소영", 12345, "01012345678");
		//Address ad3 = new Address("이혜빈", 67890, "01087654321");
		//Address ad4 = new Address("김명현", 15387, "01098765432");
		//Address ad5 = new Address("신명호", 31312, "01023456789");
		
		ArrayList<Address> adList = new ArrayList<Address>();
		adList.add(new Address("전수현", 62249, "01030302387"));
		adList.add(new Address("나소영", 12345, "01012345678"));
		adList.add(new Address("이혜빈", 67890, "01087654321"));
		adList.add(new Address("김명현", 15387, "01098765432"));
		adList.add(new Address("신명호", 31312, "01023456789"));
		
		
		for(int i=0;i<adList.size();i++) {
			String name = adList.get(i).getName();
			int mail=adList.get(i).getMail();
			String tel = adList.get(i).getTel();
			
			System.out.printf(i+1+". %s(%s) 번지수 : %d\n",name, tel,mail);
		}
		
		
		
		
	}

}
