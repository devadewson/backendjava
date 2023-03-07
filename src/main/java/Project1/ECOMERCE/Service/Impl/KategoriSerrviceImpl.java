package Project1.ECOMERCE.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project1.ECOMERCE.Service.KategoriService;
import Project1.ECOMERCE.model.KategoriModel;
import Project1.ECOMERCE.repository.KategoriRepository;


@Service
public class KategoriSerrviceImpl implements KategoriService {
	
	@Autowired
	KategoriRepository  kategorirepository;
	
	
	@Override
	public List<KategoriModel> findAll(){
		
		return kategorirepository.findAll();
	}
	
	public String reqKategori(KategoriModel req) {
		String result = "gagal";
		if (req !=null) {
			kategorirepository.save(req);
		result = "berhasil";
		
		}
		
		return result;
	}
	@Override
	public String updKategori(KategoriModel req) {
		String result = "gagal update data";
		
		Optional<KategoriModel> optUser = 
				
				kategorirepository.findById(req.getId_kategori());
		 
		if(optUser.isPresent()) {
			kategorirepository.save(req);
			 result = "sukses update program";
		 }
		return result;
	}
	
	@Override
	public String delKategori(String id) {
		String result = "berhasil hapus data";
		
		Optional<KategoriModel> optKategori = 
				kategorirepository.findById(id);
		
		 if(optKategori.isPresent()) {
			 kategorirepository.deleteById(id);
			 result = "sukses hapus data";
		 }
		 
		return result;
	}

}
