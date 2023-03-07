package Project1.ECOMERCE.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "TUJUAN",schema = "HR")
@Entity
public class Tujuan {

	@Id
	@Column(name =  "ID_TUJUAN")
	private	String idTujuan;
	
	@Column(name =  "NAMA_TUJUAN")
	private String nama_tujuan;
	
	@Column(name =  "ONGKIR")
	private Integer ongkir;

	public String getIdTujuan() {
		return idTujuan;
	}

	public void setIdTujuan(String idTujuan) {
		this.idTujuan = idTujuan;
	}

	public String getNama_tujuan() {
		return nama_tujuan;
	}

	public void setNama_tujuan(String nama_tujuan) {
		this.nama_tujuan = nama_tujuan;
	}

	public Integer getOngkir() {
		return ongkir;
	}

	public void setOngkir(Integer ongkir) {
		this.ongkir = ongkir;
	}

	public String getIdTujuan1() {
		// TODO Auto-generated method stub
		return idTujuan;
	}
	
}