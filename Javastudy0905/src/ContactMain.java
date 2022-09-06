
public class ContactMain {

	public static void main(String[] args) {

		Contact ct1 = new Contact("¿Ã¡÷»Ò", 20, "010-1234-5678");
		Contact ct2 = new Contact("±Ë¡ˆ¿∫", 21, "010-1111-1111");
		Contact ct3 = new Contact("¿Ã¿∫∫Ò", 22, "010-2222-2222");
		Contact ct4 = new Contact("¿”Ω¬»Ø", 23, "010-3333-3333");

		Contact[] contact = { ct1, ct2, ct3, ct4 };

		for (int i = 0; i < contact.length; i++) {
			
			String name = contact[i].getName();
			int age = contact[i].getAge();
			String tel = contact[i].getTel();

			System.out.printf("%S(%dºº) : %s%n", name, age, tel);

		}

	}

}
