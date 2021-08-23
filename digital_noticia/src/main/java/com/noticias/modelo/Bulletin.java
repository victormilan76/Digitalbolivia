package com.noticias.modelo;

import java.util.Date;

public class Bulletin {
	private int id;
	private int accountId;
	private int commentCounter; 
	private  Date conectedDate;
	private int id_RateLikes;
	private int idDetected;
	private Date postDate;
	private int sendUserId;
	private String textId;
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
	public int getCommentCounter() {
		return commentCounter;
	}
	public void setCommentCounter(int commentCounter) {
		this.commentCounter = commentCounter;
	}
	public Date getConectedDate() {
		return conectedDate;
	}
	public void setConectedDate(Date conectedDate) {
		this.conectedDate = conectedDate;
	}
	public int getId_RateLikes() {
		return id_RateLikes;
	}
	public void setId_RateLikes(int id_RateLikes) {
		this.id_RateLikes = id_RateLikes;
	}
	public int getIdDetected() {
		return idDetected;
	}
	public void setIdDetected(int idDetected) {
		this.idDetected = idDetected;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public int getSendUserId() {
		return sendUserId;
	}
	public void setSendUserId(int sendUserId) {
		this.sendUserId = sendUserId;
	}
	public String getTextId() {
		return textId;
	}
	public void setTextId(String textId) {
		this.textId = textId;
	}
}
