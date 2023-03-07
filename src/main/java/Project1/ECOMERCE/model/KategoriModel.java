package Project1.ECOMERCE.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "KATEGORI",schema = "HR")
@Entity
public class KategoriModel {

	@Id
	@Column(name =  "ID_KATEGORI")
	private	String id_kategori;
	
	@Column(name =  "NAMA_KATEGORI")
	private String nama_kategori;

	public String getId_kategori() {
		return id_kategori;
	}

	public void setId_kategori(String id_kategori) {
		this.id_kategori = id_kategori;
	}

	public String getNama_kategori() {
		return nama_kategori;
	}

	public void setNama_kategori(String nama_kategori) {
		this.nama_kategori = nama_kategori;
	}
	


}
