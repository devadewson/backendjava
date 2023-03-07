package Project1.ECOMERCE.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "PEMESANAN",schema = "HR")
@Entity
public class Pemesanan {

	@Id
	@Column(name =  "ID_PEMESANAN")
	private	String idPemesanan;
	
	
	@Column(name =  "ID_USER")
	private	String idUser;
	
	
	@Column(name =  "ID_PRODUK")
	private	String idProduk;
	
	
	@Column(name =  "ID_TUJUAN")
	private	String idTujuan;
	
	@Column(name =  "ALAMAT")
	private	String alamat;
	
	@Column(name =  "JUMLAH_BELI")
	private	Integer jumlahBeli;
	
	@Column(name =  "TOTAL_BELANJA")
	private	Integer totalBelanja;
	
	@Column(name =  "ONGKIR")
	private	Integer ongkir;
	
	@Column(name =  "TOTAL_BAYAR")
	private	Integer totalBayar;

	public String getIdPemesanan() {
		return idPemesanan;
	}

	public void setIdPemesanan(String idPemesanan) {
		this.idPemesanan = idPemesanan;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getIdProduk() {
		return idProduk;
	}

	public void setIdProduk(String idProduk) {
		this.idProduk = idProduk;
	}

	public String getIdTujuan() {
		return idTujuan;
	}

	public void setIdTujuan(String idTujuan) {
		this.idTujuan = idTujuan;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Integer getJumlahBeli() {
		return jumlahBeli;
	}

	public void setJumlahBeli(Integer jumlahBeli) {
		this.jumlahBeli = jumlahBeli;
	}

	public Integer getTotalBelanja() {
		return totalBelanja;
	}

	public void setTotalBelanja(Integer totalBelanja) {
		this.totalBelanja = totalBelanja;
	}

	public Integer getOngkir() {
		return ongkir;
	}

	public void setOngkir(Integer ongkir) {
		this.ongkir = ongkir;
	}

	public Integer getTotalBayar() {
		return totalBayar;
	}

	public void setTotalBayar(Integer totalBayar) {
		this.totalBayar = totalBayar;
	}
	
	
}
