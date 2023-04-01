package member;
import java.util.*;

public class MemberProImpl2 implements MemberPro{
	private Scanner in;
	private HashSet set;
	
	public MemberProImpl2() {
		in = new Scanner(System.in);
		set = new HashSet();
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
		set.add(mb);
	}

	@Override
	public void view() {
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member mb = (Member)obj;
			mb.disp();
		}
	}
	
	protected Member isName(String name) {
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member mb = (Member)obj;
			if (mb.getName().equals(name)) {
				return mb;
			}
		}
		return null;
	}

	@Override
	public void edit() {
		System.out.print("������ ȸ���� �̸� : ");
		String name = in.next();
		Member mb = isName(name);
		if (mb == null) {
			System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		}else {
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
		Member mb = isName(name);
		if (mb == null) {
			System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		}else {
			System.out.println(name+"���� �����մϴ�.");
			set.remove(mb);
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

}
