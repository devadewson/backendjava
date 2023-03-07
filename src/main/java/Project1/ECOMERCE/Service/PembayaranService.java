package Project1.ECOMERCE.Service;

import java.util.List;


import Project1.ECOMERCE.model.Pembayaran;

public interface PembayaranService  {
public List<Pembayaran> findAll();
	
	public String reqPembayaran(Pembayaran req);
	
	public String updPembayaran(Pembayaran req);
	
	public String delPembayaran(String id);

}
