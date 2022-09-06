
public class Person {

	// ���� ���ϴ� ����� ���� �� �ִ� ���赵!
	
	// Ŭ������ ���� : �ʵ�, �޼ҵ�
	// ����� Ư¡ : ����, �̸�, ����, Ű ...	
	String name;
	int age;
	String gender;
	int height;
	
	// ������
	// ����Ű : ��Ŭ�� -> source -> Generator Constructor using Fields
	// 		: �츮�� �����ص� �ʵ带 �̿��ؼ� ������ �����
	// ������ Ư¡
	// 1. ����Ÿ�� ����(void��ü�� ����)
	// 2. ������ �޼ҵ� �̸��� Ŭ���� �̸��� ����
	public Person(String name, int age, String gender, int height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	
	// 4. ������ �޼ҵ�� �����ε�(�ߺ�����)�� ����
	// �⺻������, default ������
	// ��ü ���� ��, �����ڰ� ���°�� compile �� �� �⺻ �����ڰ� �ڵ� ����
	// But, �����ڰ� �ϳ� �̻��� �����ϸ� �⺻�����ڴ� �ڵ� ����X
	public Person() {
		
	}
	
	// ����� �ൿ : ���ϱ�, �Ա�, �ȱ�, �ڱ�...
	public void talk() {
		System.out.println("�������� ���ϴ�!");
	}
	public void eat() {
		System.out.println("�ȳ� �Ա�~");
	}
	public void walk() {
		System.out.println("�ѹ��ѹ� �ȱ�..����");
	}
	public void sleep() {
		System.out.println("�����ڱ�Zzzzz");
	}
	
	
	
	
}
