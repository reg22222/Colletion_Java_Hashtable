package member;

public class Member {
	private String name;
	private String tel;
	private String addr;
	
	public Member(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getName() {
		return name;
	}
	public void disp() {
		System.out.println(name+"���� ��ȭ��ȣ�� " + tel 
				+"���̰�, �ּҴ� " + addr+"�Դϴ�.");
	}
}









