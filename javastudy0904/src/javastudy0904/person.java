package javastudy0904;

public class person {
	private String name;
	private int age;
	private String gender;
	private int height;
	public person(String name, int age, String gender, int height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void talk() {
		System.out.println("ÀçÀßÀçÀß ¸»ÇÏ´Ù!");
	}
	
	public void eat() {
		System.out.println("³È³È ¸Ô±â");
	}
	public void walk() {
		System.out.println("¶Ñ¹÷¶Ñ¹÷ °È±â .. ÇíÇí");
	}
	
	
	
}
