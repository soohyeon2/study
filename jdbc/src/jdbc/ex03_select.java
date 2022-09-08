package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex03_select {

	public static void main(String[] args) {
		try {
	         // 1.JDBC �����ε�
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         
	         // 2. DB�� ����
	         // DB�� ������ �� -> ������ ����ؼ� url, id, pw�� ���
	         // localhost = 127.0.0.1 -> �� ��ǻ�� ip�ּ�
	         String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	         String id = "hr";
	         String pw = "hr";
	         
	         Connection conn = DriverManager.getConnection(url, id, pw);
	         
	         if(conn != null) {
	            System.out.println("���Ἲ��");
	         }else {
	            System.out.println("�������");
	         }
	         
	         // 3. sql �ۼ�/����
	         // ���̵� ��й�ȣ �̸� ����
	         // "hyebin", "1234", "������", 24
	         String sql = "select * from member where id =?" ;
	         PreparedStatement psmt = conn.prepareStatement(sql);
	         psmt.setString(1, "sh");
	         
	         ResultSet rs = psmt.executeQuery();
	         // CURD : Create, Update, Read, Delete
	         // excuteUpdate() : insert, update, delete -> ���ϰ� :int
	         // excuteQuery() : select
	         
	         rs.next();
	         String id1 = rs.getString(1);
	         String pw1 = rs.getString(2);
	         String name1 = rs.getString(3);
	         int age1 = rs.getInt(4);
	         
	         System.out.printf("%s\t%s\t%s\t%d",id1,pw1,name1,age1);
	         
	         
	         // 4. ����
	         if(rs!=null) {
	        	 rs.close();
	         }
	         if(psmt!=null) {
	        	 psmt.close();
	         }
	         if(conn !=null) {
	         conn.close();
	         }
	         
	      } catch (ClassNotFoundException e) {
	         System.out.println("�����ε� ����!");
	      } catch(SQLException e) {
	         System.out.println("DB���� ����!");
	      }

	}

}
