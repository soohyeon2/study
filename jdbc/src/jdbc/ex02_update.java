package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex02_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// JDBC ���� ����(4�ܰ�)
			      // �����۾� - ojdbc6.jar 
			      
			      try {
			         // 1.JDBC �����ε�
			         Class.forName("oracle.jdbc.driver.OracleDriver");
			         
			         
			         // 2. DB�� ����
			         // DB�� ������ �� -> ������ ����ؼ� url, id, pw�� ���
			         // localhost = 127.0.0.1 -> �� ��ǻ�� ip�ּ�
			         String url = "jdbc:oracle:thin:@127.0.0.1:1521:Xe";
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
			         String sql = "update member set id=? where id=?" ;
			         PreparedStatement psmt = conn.prepareStatement(sql);
			         psmt.setString(1, "sh");
			         psmt.setString(2, "soohyeon");
			         int cnt = psmt.executeUpdate();
			         
			         System.out.println("cnt �� : "+cnt);
			         if(cnt>0) {
			        	 System.out.println("update ����");
			         }
			         else {
			        	 System.out.println("update ����");
			         }
			         
			         // 4. ����
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
