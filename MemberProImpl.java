package member;
import java.util.*;

public class MemberProImpl implements MemberPro {
	private Hashtable map;
	private Scanner in;
	
	public MemberProImpl() {
		map = new Hashtable();
		in = new Scanner(System.in);
	}
	
	@Override
	public void input() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		System.out.print("��ȭ��ȣ�� �Է� : ");
		String tel = in.next();
		System.out.print("�ּҸ� �Է� : ");
		String addr = in.next();
		Member mb = new Member(name, tel, addr);
		
		map.put(name, mb);
	}

	@Override
	public void view() {
		Enumeration enu = map.keys();
		while(enu.hasMoreElements()) {
			Object obj1 = enu.nextElement();
			String key = (String)obj1;
			Object obj2 = map.get(key);
			Member mb = (Member)obj2;
			mb.disp();
		}		
	}

	@Override
	public void edit() {
		System.out.print("������ ȸ���� �̸� : ");
		String name = in.next();
		if (!map.containsKey(name)) {
			System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		}else {
			Member mb = (Member)map.get(name);
			System.out.println("���� "+name+"���� ��ȭ��ȣ�� " + mb.getTel()+"���Դϴ�.");
			System.out.print("�����Ͻ� ��ȭ��ȣ : ");
			mb.setTel(in.next());
			System.out.println("���� "+name+"���� �ּҴ� " + mb.getAddr()+"���Դϴ�.");
			System.out.print("�����Ͻ� �ּ� : ");
			mb.setAddr(in.next());
			System.out.println(name+"���� ������ �����Ͽ����ϴ�.");
		}
		
	}

	@Override
	public void delete() {
		System.out.print("������ ȸ���� �̸� : ");
		String name = in.next();
		if (map.containsKey(name)) {
			map.remove(name);
			System.out.println(name+"ȸ������ �����Ͽ����ϴ�.");
		}else {
			System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		}
		
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		
	}

}
