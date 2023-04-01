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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		System.out.print("전화번호를 입력 : ");
		String tel = in.next();
		System.out.print("주소를 입력 : ");
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
		System.out.print("수정할 회원의 이름 : ");
		String name = in.next();
		if (!map.containsKey(name)) {
			System.out.println(name+"님은 저희 회원이 아닙니다.");
		}else {
			Member mb = (Member)map.get(name);
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
		if (map.containsKey(name)) {
			map.remove(name);
			System.out.println(name+"회원님을 삭제하였습니다.");
		}else {
			System.out.println(name+"님은 저희 회원이 아닙니다.");
		}
		
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
	}

}
