package model;

public class User {

	private long id;
	private String login;
	private String password;
	private Role role;

	public User() {
		super();

	}

	public User(String login, String password, Role role) {
		super();
		this.login = login;
		this.password = password;
		this.role = role;
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
		this.role = Role.USER;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", role=" + role + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}