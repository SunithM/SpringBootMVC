package com.sunith.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien  
{
	@Id
	int aid;
	String aname;
	public Alien(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	
	public Alien()
	{
		
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}

}
