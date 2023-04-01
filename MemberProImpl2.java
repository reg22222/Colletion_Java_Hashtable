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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		System.out.print("전화번호를 입력 : ");
		String tel = in.next();
		System.out.print("주소를 입력 : ");
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
		System.out.print("수제할 회원의 이름 : ");
		String name = in.next();
		Member mb = isName(name);
		if (mb == null) {
			System.out.println(name+"님은 저희 회원이 아닙니다.");
		}else {
			System.out.println("현재 "+name+"님의 전화번호는 " + mb.getTel()+"번입니다.");
			System.out.print("수정하실 전화번호 : ");
			mb.setTel(in.next());
			System.out.println("현재 "+name+"님의 주소는 " + mb.getAddr()+"번입니다.");
			System.out.print("수정하실 주소 : ");
			mb.setAddr(in.next());
			System.out.println(name+"님의 정보를 수정하였습니다.");
		}
	}

	@Override
	public void delete() {
		System.out.print("삭제할 회원의 이름 : ");
		String name = in.next();
		Member mb = isName(name);
		if (mb == null) {
			System.out.println(name+"님은 저희 회원이 아닙니다.");
		}else {
			System.out.println(name+"님을 삭제합니다.");
			set.remove(mb);
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
