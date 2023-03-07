package Project1.ECOMERCE.Service;

import java.util.List;

import Project1.ECOMERCE.model.KategoriModel;

public interface KategoriService {

public List<KategoriModel> findAll();
	
	public String reqKategori(KategoriModel req);
	
	public String updKategori(KategoriModel req);
	
	public String delKategori(String id);

}
