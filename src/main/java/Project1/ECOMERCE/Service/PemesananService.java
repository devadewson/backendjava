package Project1.ECOMERCE.Service;

import java.io.IOException;
import java.util.List;

import Project1.ECOMERCE.DTO.dtopemesanan;
import Project1.ECOMERCE.model.Pemesanan;
import net.sf.jasperreports.engine.JRException;


public interface PemesananService {

public List<Pemesanan> findAll();
	
	public String reqPemesanan(Pemesanan req);
	
	public String updPemesanan(Pemesanan req);
	
	public String delPemesanan(String id);
	
	public List<dtopemesanan> getViewByDto (String idPemesanan);
	
	public List<Pemesanan> getProdukByIdPemesanan(String idPemesanan);
	
	public byte[] generatePemesanan() throws IOException, JRException;
	
	public List<dtopemesanan> getViewPemesanan (String idPemesanan);
	

}
