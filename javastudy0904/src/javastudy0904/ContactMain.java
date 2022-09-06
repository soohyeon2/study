package javastudy0904;

public class ContactMain {

	public static void main(String[] args) {
		Contact ct1= new Contact("전수현",20,"010-3030-2387");
		Contact ct2 = new Contact("김지은",21,"010-1111-1111");
		Contact ct3= new Contact("이은비",22,"010-2222-2222");
		Contact ct4= new Contact("임승환",23,"010-3333-3333");
		
		
		Contact [] contact = {ct1,ct2,ct3,ct4};
		
		for(int i=0;i<contact.length;i++) {
			String name=contact[i].getName();
			int age= contact[i].getAge();
			String tel = contact[i].getTel();
			
			System.out.printf("%S(%d세)  :  %s \n", name, age, tel);
			

		}
		
		
	}

}
