package member;
/*
 * User에 정보
 * 1. 이름
 * 2. 연락처
 * 3. 아이디
 * 4. 비밀번호
 */

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
	private String phone;
	private String id;
	private String pw;
	
	public static List<User> userArr= new ArrayList<>();
	
	public User() {
		super();
	}

	public User(String name, String phone, String id, String pw) {
		super();
		this.name = name;
		this.phone = phone;
		this.id = id;
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public void list(User user) {
		userArr.add(user);
	}

	
	
	
}
