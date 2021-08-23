package com.noticias.modelo;

import java.util.Date;

public class BulletinComment {
	private int id;
	private int accountId;
	private Date conectedDate;
	private int id_bulletin2;
	private int repitreCounter;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public Date getConectedDate() {
		return conectedDate;
	}
	public void setConectedDate(Date conectedDate) {
		this.conectedDate = conectedDate;
	}
	public int getId_bulletin2() {
		return id_bulletin2;
	}
	public void setId_bulletin2(int id_bulletin2) {
		this.id_bulletin2 = id_bulletin2;
	}
	public int getRepitreCounter() {
		return repitreCounter;
	}
	public void setRepitreCounter(int repitreCounter) {
		this.repitreCounter = repitreCounter;
	}
	
	
}
