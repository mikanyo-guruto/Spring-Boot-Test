package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	// これの下に記述した変数がプライマリーキーになる
	@Id
	// 連番が自動で振られる
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private byte[] user_id;
	private byte[] pass;
	private String name;
	private java.sql.Date create_time;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public byte[] getUser_id() {
		return user_id;
	}
	public void setUser_id(byte[] user_id) {
		this.user_id = user_id;
	}
	public byte[] getPass() {
		return pass;
	}
	public void setPass(byte[] pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.sql.Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(java.sql.Date create_time) {
		this.create_time = create_time;
	}

}
