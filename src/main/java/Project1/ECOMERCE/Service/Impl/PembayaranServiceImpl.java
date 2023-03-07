package Project1.ECOMERCE.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project1.ECOMERCE.Service.PembayaranService;
import Project1.ECOMERCE.model.Pembayaran;

import Project1.ECOMERCE.repository.PembayaranRepository;


@Service
public class PembayaranServiceImpl implements PembayaranService {
	@Autowired
	PembayaranRepository  pembayaranrepository;
	
	
	@Override
	public List<Pembayaran> findAll(){
		
		return pembayaranrepository.findAll();
	}
	
	public String reqPembayaran(Pembayaran req) {
		String result = "gagal";
		if (req !=null) {
			pembayaranrepository.save(req);
		result = "berhasil";
		
		}
		
		return result;
	}
	@Override
	public String updPembayaran(Pembayaran req) {
		String result = "gagal update data";
		
		Optional<Pembayaran> optPembayaran = 
				
				pembayaranrepository.findById(req.getid_pembayaran());
		 
		if(optPembayaran.isPresent()) {
			pembayaranrepository.save(req);
			 result = "sukses update program";
		 }
		return result;
	}
	
	@Override
	public String delPembayaran(String id) {
		String result = "berhasil hapus data";
		
		Optional<Pembayaran> optPembayaran = 
				pembayaranrepository.findById(id);
		
		 if(optPembayaran.isPresent()) {
			 pembayaranrepository.deleteById(id);
			 result = "sukses hapus data";
		 }
		 
		return result;
	}

}
