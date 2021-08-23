package com.noticias.modelo;

import java.util.Date;

public class User {
		private int id;
		private int accountId;
		private Date createdDate;
		private String fistName;
		private String lastName;
		private int isDeleted;
		
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
		public Date getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}
		public String getFistName() {
			return fistName;
		}
		public void setFistName(String fistName) {
			this.fistName = fistName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getIsDeleted() {
			return isDeleted;
		}
		public void setIsDeleted(int isDeleted) {
			this.isDeleted = isDeleted;
		}
		
}
