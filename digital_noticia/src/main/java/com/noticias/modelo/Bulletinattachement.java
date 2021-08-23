package com.noticias.modelo;
import java.util.Date;

public class Bulletinattachement {

	private int id;
	private int accoundId;
	private Date conectedDate;
	private String  field;
	private int id_bulletin;
	private int isDetected;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccoundId() {
		return accoundId;
	}
	public void setAccoundId(int accoundId) {
		this.accoundId = accoundId;
	}
	public Date getConectedDate() {
		return conectedDate;
	}
	public void setConectedDate(Date conectedDate) {
		this.conectedDate = conectedDate;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public int getId_bulletin() {
		return id_bulletin;
	}
	public void setId_bulletin(int id_bulletin) {
		this.id_bulletin = id_bulletin;
	}
	public int getIsDetected() {
		return isDetected;
	}
	public void setIsDetected(int isDetected) {
		this.isDetected = isDetected;
	}
	
	
	
	
}

