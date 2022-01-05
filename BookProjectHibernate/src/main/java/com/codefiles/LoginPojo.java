package com.codefiles;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class LoginPojo {
	@Id
	private String uname;
	private String pwd;
	
	public LoginPojo() {
		// TODO Auto-generated constructor stub
	}

	public LoginPojo(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
