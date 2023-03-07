package Project1.ECOMERCE.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;



import Project1.ECOMERCE.model.Produk;

public interface ProdukService {

public List<Produk> findAll();
	
	public String reqProduk(Produk req);
	
	public String updProduk(Produk req);
	
	public String delProduk(String id);
	
	public byte [] getgambarbyid(String id_produk) ;
	
	public String uploadImage(MultipartFile file, String id_produk) throws IOException;
	

}
