package member;
/*
 * * User에 정보
 * 1. 이름
 * 2. 아이디
 * 3. 비밀번호
 */
public class Admin {
	private String name;
	private String id;
	private String pw;
	
	public Admin() {
		super();
	}

	public Admin(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	
	
	
	
}
