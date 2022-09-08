package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex03_select {

	public static void main(String[] args) {
		try {
	         // 1.JDBC 동적로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         
	         // 2. DB와 연결
	         // DB에 접근할 때 -> 변수를 사용해서 url, id, pw를 사용
	         // localhost = 127.0.0.1 -> 내 컴퓨터 ip주소
	         String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	         String id = "hr";
	         String pw = "hr";
	         
	         Connection conn = DriverManager.getConnection(url, id, pw);
	         
	         if(conn != null) {
	            System.out.println("연결성공");
	         }else {
	            System.out.println("연결실패");
	         }
	         
	         // 3. sql 작성/전송
	         // 아이디 비밀번호 이름 나이
	         // "hyebin", "1234", "이혜빈", 24
	         String sql = "select * from member where id =?" ;
	         PreparedStatement psmt = conn.prepareStatement(sql);
	         psmt.setString(1, "sh");
	         
	         ResultSet rs = psmt.executeQuery();
	         // CURD : Create, Update, Read, Delete
	         // excuteUpdate() : insert, update, delete -> 리턴값 :int
	         // excuteQuery() : select
	         
	         rs.next();
	         String id1 = rs.getString(1);
	         String pw1 = rs.getString(2);
	         String name1 = rs.getString(3);
	         int age1 = rs.getInt(4);
	         
	         System.out.printf("%s\t%s\t%s\t%d",id1,pw1,name1,age1);
	         
	         
	         // 4. 종료
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
	         System.out.println("동적로딩 실패!");
	      } catch(SQLException e) {
	         System.out.println("DB연결 실패!");
	      }

	}

}
