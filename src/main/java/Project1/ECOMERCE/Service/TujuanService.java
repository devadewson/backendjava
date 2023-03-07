package Project1.ECOMERCE.Service;

import java.util.List;

import Project1.ECOMERCE.model.Tujuan;

public interface TujuanService {
public List<Tujuan> findAll();
	
	public String reqTujuan(Tujuan req);
	
	public String updTujuan(Tujuan req);
	
	public String delTujuan(String id);
	

}
