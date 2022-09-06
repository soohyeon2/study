package oop;

public class studentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st1=new student();
		st1.setName("È«±æµ¿");
		st1.setNumber("20150675");
		st1.setAge(22);
		st1.setScoreJava(50);
		st1.setScoreWeb(89);
		st1.setScoreAndroid(77);
		
		student st2 = new student("±è¿µÈñ", "20090541",29,90,25,30);
		
		
		int sum1 = st1.getScoreAndroid()+st1.getScoreJava()+st1.getScoreWeb();
		int sum2 = st2.getScoreAndroid()+st2.getScoreJava()+st2.getScoreWeb();
		
		
		System.out.println(sum1/3.0);
		System.out.println(sum2/3.0);
		
		st1.show();
		st2.show();
		
	}
	
}
