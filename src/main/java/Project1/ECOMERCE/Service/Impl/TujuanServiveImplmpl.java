package Project1.ECOMERCE.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project1.ECOMERCE.Service.TujuanService;
import Project1.ECOMERCE.model.Tujuan;
import Project1.ECOMERCE.repository.TujuanRepository;

@Service
public class TujuanServiveImplmpl implements TujuanService {
	@Autowired
	TujuanRepository  tujuanrepository;
	
	
	@Override
	public List<Tujuan> findAll(){
		
		return tujuanrepository.findAll();
	}
	
	public String reqTujuan(Tujuan req) {
		String result = "gagal";
		if (req !=null) {
			tujuanrepository.save(req);
		result = "berhasil";
		
		}
		
		return result;
	}
	@Override
	public String updTujuan(Tujuan req) {
		String result = "gagal update data";
		
		Optional<Tujuan> optTujuan = tujuanrepository.findById(req.getIdTujuan());
		 
		if(optTujuan.isPresent()) {
			tujuanrepository.save(req);
			 result = "sukses update program";
		 }
		return result;
	}
	
	@Override
	public String delTujuan(String id) {
		String result = "berhasil hapus data";
		
		Optional<Tujuan> optTujuan = 
				tujuanrepository.findById(id);
		
		 if(optTujuan.isPresent()) {
			 tujuanrepository.deleteById(id);
			 result = "sukses hapus data";
		 }
		 
		return result;
	}


	
}
