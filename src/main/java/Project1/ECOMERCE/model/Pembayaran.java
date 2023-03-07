package Project1.ECOMERCE.model;

import java.sql.Blob;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "PEMBAYARAN",schema = "HR")
@Entity
public class Pembayaran {

	@Id
	@Column(name =  "ID_PEMBAYARAN")
	private	String id_pembayaran;
	
	@Column(name =  "ID_PEMESANAN")
	private String idPemesanan;
	
	@Column(name =  "TOTAL_BAYAR")
	private	Integer total_bayar;
	
	@Column(name =  "TGL_PEMBAYARAN")
	private	Date tgl_pembayaran;
	
	@Column(name =  "BUKTI_BAYAR")
	private	Blob bukti_bayar;
	
	
	public String getid_pembayaran() {
		return id_pembayaran;
	}
	public void setid_pembayaran(String id_pembayaran) {
		this.id_pembayaran = id_pembayaran;
	}

	public String getidPemesanan() {
		return idPemesanan;
	}
	public void setidPemesanan(String idPemesanan) {
		this.idPemesanan = idPemesanan;
	}
	
	public Integer gettotal_bayar() {
		return total_bayar;
	}
	public void settotal_bayar(Integer total_bayar) {
		this.total_bayar = total_bayar;
	}
	public Date gettgl_pembayaran() {
		return tgl_pembayaran;
	}
	public void settgl_pembayaran(Date  tgl_pembayaran) {
		this.tgl_pembayaran = tgl_pembayaran;
	}
	
	public Blob getbukti_bayar() {
		return bukti_bayar;
	}
	public void bukti_bayar(Blob  bukti_bayar) {
		this.bukti_bayar = bukti_bayar;
	}
}
