package Project1.ECOMERCE.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;



@Entity
@Table(name = "PRODUK",schema = "HR")


public class Produk {
	@Id
	@Column(name =  "ID_PRODUK")
	private	String idProduk;
	
	@Column(name =  "NAMA_PRODUK")
	private String nama_produk;
	
	@Column(name =  "ID_KATEGORI")
	private String id_kategori;
	
	@Column(name =  "HARGA")
	private Integer harga;
	
	@Column(name =  "STOCK")
	private Integer stock;
	
	@Lob
    @Column(name = "GAMBAR", length = 4000)
    private byte[] gambar;

	public String getIdProduk() {
		return idProduk;
	}

	public void setIdProduk(String idProduk) {
		this.idProduk = idProduk;
	}

	public String getNama_produk() {
		return nama_produk;
	}

	public void setNama_produk(String nama_produk) {
		this.nama_produk = nama_produk;
	}

	public String getId_kategori() {
		return id_kategori;
	}

	public void setId_kategori(String id_kategori) {
		this.id_kategori = id_kategori;
	}

	public Integer getHarga() {
		return harga;
	}

	public void setHarga(Integer harga) {
		this.harga = harga;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public byte[] getGambar() {
		return gambar;
	}

	public void setGambar(byte[] gambar) {
		this.gambar = gambar;
	}

	
}
