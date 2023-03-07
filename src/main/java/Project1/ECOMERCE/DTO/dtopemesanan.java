package Project1.ECOMERCE.DTO;

public class dtopemesanan {

	//tbuser
	private String nama;
	private String nohp;
	
	//tb tujuan
	private String nama_tujuan;
	private Integer ongkir;
	
	//tbproduk
	private Integer harga;

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNohp() {
		return nohp;
	}

	public void setNohp(String nohp) {
		this.nohp = nohp;
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

	public Integer getHarga() {
		return harga;
	}

	public void setHarga(Integer harga) {
		this.harga = harga;
	}

}