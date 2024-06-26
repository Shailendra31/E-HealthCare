package com.entity;

public class Appointment {

		private int aid;
		private int uid;
		private String diseases;
		private String doa;
		private int rid;
		private String status;
		public Appointment() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Appointment(int uid, String diseases, String doa, int rid, String status) {
			super();
			this.uid = uid;
			this.diseases = diseases;
			this.doa = doa;
			this.rid = rid;
			this.status = status;
		}
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getDiseases() {
			return diseases;
		}
		public void setDiseases(String diseases) {
			this.diseases = diseases;
		}
		public String getDoa() {
			return doa;
		}
		public void setDoa(String doa) {
			this.doa = doa;
		}
		public int getRid() {
			return rid;
		}
		public void setRid(int rid) {
			this.rid = rid;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		
		
	
}
