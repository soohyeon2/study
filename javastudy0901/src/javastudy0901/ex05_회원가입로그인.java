package javastudy0901;

import java.util.Scanner;

public class ex05_ȸ�����Էα��� {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      // ���α׷��� �����ϸ�
	      String[] id = new String[3];
	      String[] pw = new String[3];

	      id[0] = "������";
	      pw[0] = "5850";

	      id[1] = "aibig";
	      pw[1] = "1209";

	      // [1]ȸ������ [2]�α��� [3]���� >>
	      // menu : �Է¹��� ���� �̸�
	      // 3�� �Է��ϸ� "���α׷� ����!"�� ���� while�� Ż��
	      while (true) {

	         System.out.print("[1]ȸ������ [2]�α��� [3]���� >> ");
	         int menu = sc.nextInt();

	         if (menu == 1) {
	            System.out.println("====ȸ������====");
	            // "ȸ�������� ID : "
	            // �Է¹��� ���� id[2]�� ����
	            System.out.print("ȸ�������� ID : ");
	            id[2] = sc.next();
	            // id[2] = db_id;

	            // "ȸ�������� PW : "
	            // �Է¹��� ���� pw[2]�� ����
	            System.out.print("ȸ�������� PW : ");
	            pw[2] = sc.next();

	            // "ȸ������ �Ϸ�"
	            System.out.println("ȸ������ �Ϸ�");

	         } else if (menu == 2) {
	            System.out.println("====�α���====");

	            // "ID�� �Է� : "
	            // �Է¹��� ID�� input_id �� ����
	            System.out.print("ID�� �Է� : ");
	            String input_id = sc.next();

	            // "PW�� �Է� : "
	            // �Է¹��� PW�� input_pw �� ����
	            System.out.print("PW�� �Է� : ");
	            String input_pw = sc.next();

	            // for���� ���� �迭�� ���鼭 input_id �� input_pw �� �迭�� ���� ��ġ�Ѵٸ�
	            // "�α��� ����" ���
	            // �ƴ϶��
	            // "�α��� ����" ���
	            boolean check = true;
	            
	            for (int i = 0; i < id.length; i++) {
	               
	               if (input_id.equals(id[i]) && input_pw.equals(pw[i])) {            
	                  System.out.println("�α��� ����!");
	                  check = false;
	                  break;
	               }               
	            }
	            if(check == true) {
	               System.out.println("�α��� ����");
	            }

	         } else if (menu == 3) {
	            System.out.println("���α׷� ����!");
	            break;
	         } else {
	            System.out.println("�߸��Է��ϼ̽��ϴ�.");
	         }

	      }



	}

}
