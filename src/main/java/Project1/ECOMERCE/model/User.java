package Project1.ECOMERCE.model;


import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@CrossOrigin
@Table(name = "TBL_USER",schema = "HR")
@Entity
public class User {
	@Id
	@Column(name =  "ID_USER")
	private	String idUser;
	
	@Column(name =  "NAMA_USER")
	private String nama_user;
	
	@Column(name =  "NOHP")
	private String nohp;
	
	@Column(name =  "USERNAME")
	private String username;
	
	@Column(name =  "PASWORD")
	private String pasword;
	
	public String getidUser() {
		return idUser;
	}
	public void setidUser(String idUser) {
		this.idUser = idUser;
	}

	public String getnama_user() {
		return nama_user;
	}

	public void setnama_user(String nama_user) {
		this.nama_user= nama_user;
	}
	
	public String getnohp() {
		return nohp;
	}

	public void setnohp(String nohp) {
		this.nohp= nohp;
	}
		public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username= username;
	}
	public String getpasword() {
		return pasword;
	}

	public void setpasword(String pasword) {
		this.pasword= pasword;
	}


}
