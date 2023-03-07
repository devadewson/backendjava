package Project1.ECOMERCE.Service.Impl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import Project1.ECOMERCE.Service.ProdukService;
import Project1.ECOMERCE.model.Produk;
import Project1.ECOMERCE.repository.ProdukRepository;
import componen.ImageUtil;


@Service
public class ProdukServiceImpl implements ProdukService {

	@Autowired
	ProdukRepository  produkrepository;
	
	
	@Override
	public List<Produk> findAll(){
		
		return produkrepository.findAll();
	}
	
	public String reqProduk(Produk req) {
		String result = "gagal";
		if (req !=null) {
			produkrepository.save(req);
		result = "berhasil";
		
		}
		
		return result;
	}
	@Override
	public String updProduk(Produk req) {
		String result = "gagal update data";
		
		Optional<Produk> optProduk = 
				
				produkrepository.findById(req.getIdProduk());
		 
		if(optProduk.isPresent()) {
			produkrepository.save(req);
			 result = "sukses update program";
		 }
		return result;
	}
	
	@Override
	public String delProduk(String id) {
		String result = "berhasil hapus data";
		
		Optional<Produk> optProduk = 
				produkrepository.findById(id);
		
		 if(optProduk.isPresent()) {
			 produkrepository.deleteById(id);
			 result = "sukses hapus data";
		 }
		 
		return result;
	}
	public String uploadImage(MultipartFile file, String id_produk) throws IOException {
		String result = "failed to upload image";
		byte [] imagebyte = ImageUtil.compressImage(file.getBytes());
        
		Optional<Produk> ispokeext = produkrepository.findById(id_produk);
		if(ispokeext !=null) {
			Produk poke = ispokeext.get();
			poke.setGambar(imagebyte);
			
			produkrepository.save(poke);
			result= "sukese";
			
			
		}
		return result;
	}
	@Override
	public byte [] getgambarbyid(String id_produk) {
	byte[] result = null ;
	Optional<Produk> ispokeext = produkrepository.findById(id_produk);
	if (ispokeext != null) {
		Produk poke = ispokeext.get();
		result = ImageUtil.decompressImage(poke.getGambar());
	}
	return result;
	
	
}

}
        