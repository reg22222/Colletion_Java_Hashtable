package member;
import java.io.*;
public class MemberMain {
	public static void main(String[] args) throws IOException{
		MemberPro pro = new MemberProImpl();
		
		while(true) {
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 : pro.input(); break;
			case 2 : pro.view(); break;
			case 3 : pro.edit(); break;
			case 4 : pro.delete(); break;
			case 5 : pro.exit(); break;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�."); 
			}
		}
	}
}
