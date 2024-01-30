package com.raghu.bean;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserBean {
	private JdbcTemplate jt;

	public UserBean() {
		super();
	}

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public void create() {
		jt.execute("create table users(userId number(4),userName varchar2(10),password varchar2(10),address varchar2(10))");
		System.out.println("One Record Created Sucessfully");
	}
	
	public void insertRecord() {
		int i=jt.update("insert into users values(117,'Ujwala','Ujwala123','Pamidi')");
		System.out.println(i+" New record Inserted Sucessfully");
	}
	
	public void updateRecord() {
		int i=jt.update("update users set password='Badri123',address='Hyderabad' where userId=117");
		System.out.println(i+" One Record update sucessfully");
	}
	
	public void deleteRecord() {
		int i=jt.update("delete from users where userId=117");
		System.out.println(i + " One Record deleted Sucessfully");
	}
	public void getOneRecord()
	{
	 List l=jt.queryForList("select *from users where userid=117");
	 Iterator iterator=l.iterator();
	 while(iterator.hasNext()) {
		//Object o=iterator.next();
		  System.out.println(iterator.next().toString());
	 }
	}
	public void getAllrecord() {
		List l=jt.queryForList("select *from users");
		Iterator iterator=l.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
