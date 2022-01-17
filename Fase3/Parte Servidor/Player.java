package com.example.demo;

import java.io.Serializable;

public class Player implements Serializable{
	private String uName;
	private String pw;
	private int punt;
	private int Hpunt;
	
	
	
	public Player() {}	
	
	public Player(String user,String pw) {
		this.uName = user;
		this.pw = pw;
		this.punt = 0;
		this.Hpunt = 0;
		
		
	}
	
	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}
	public int getPunt() {
		return punt;
	}
	public void setPunt(int id) {
		this.punt = id;
	}
	
	public int getHpunt() {
		return Hpunt;
	}
	public void setHpunt() {
		int aPunt = this.punt;
		if (aPunt>this.Hpunt) 
		{
			this.Hpunt = aPunt;
		}
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
