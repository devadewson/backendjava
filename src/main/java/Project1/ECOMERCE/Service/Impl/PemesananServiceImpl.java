package Project1.ECOMERCE.Service.Impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;



import Project1.ECOMERCE.DTO.dtopemesanan;
import Project1.ECOMERCE.Service.PemesananService;
import Project1.ECOMERCE.model.Pemesanan;
import Project1.ECOMERCE.model.Produk;
import Project1.ECOMERCE.model.Tujuan;
import Project1.ECOMERCE.model.User;
import Project1.ECOMERCE.repository.PemesananRepository;
import Project1.ECOMERCE.repository.ProdukRepository;
import Project1.ECOMERCE.repository.TujuanRepository;
import Project1.ECOMERCE.repository.UserRepository;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@Service
public class PemesananServiceImpl implements PemesananService {
	
	@Autowired
	PemesananRepository  pemesananrepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	TujuanRepository tujuanRepository;
	@Autowired
	ProdukRepository produkRepository;
	
	
	@Override
	public List<Pemesanan> findAll(){
		
		return pemesananrepository.findAll();
	}
	
	public String reqPemesanan(Pemesanan req) {
		String result = "gagal";
		if (req !=null) {
			pemesananrepository.save(req);
		result = "berhasil";
		
		}
		
		return result;
	}
	@Override
	public String updPemesanan(Pemesanan req) {
		String result = "gagal update data";
		
		Optional<Pemesanan> optPemesanan = 
				
				pemesananrepository.findById(req.getIdPemesanan());
		 
		if(optPemesanan.isPresent()) {
			pemesananrepository.save(req);
			 result = "sukses update program";
		 }
		return result;
	}
	
	@Override
	public String delPemesanan(String id) {
		String result = "berhasil hapus data";
		
		Optional<Pemesanan> optPemesanan = 
				pemesananrepository.findById(id);
		
		 if(optPemesanan.isPresent()) {
			 pemesananrepository.deleteById(id);
			 result = "sukses hapus data";
		 }
		 
		return result;
	}

	@Override
	public List<dtopemesanan> getViewByDto(String idPemesanan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pemesanan> getProdukByIdPemesanan(String idPemesanan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<dtopemesanan> getViewPemesanan(String idPemesanan) {
		
		List<dtopemesanan> dtoPemesanan1 = new ArrayList<>();
		List<Pemesanan> pemesananById = pemesananrepository.findByIdPemesanan(idPemesanan);
		
		for (Pemesanan loop : pemesananById) {
			dtopemesanan tempUserPemesanan = new dtopemesanan();
			
			//tbluser
			User name = userRepository.findByIdUser(loop.getIdUser());
			
			tempUserPemesanan.setNama(name.getnama_user());
			tempUserPemesanan.setNohp(name.getnohp());
			
			//tbltujuan
			
			Tujuan tuja = tujuanRepository.findByIdTujuan(loop.getIdTujuan());
			
			tempUserPemesanan.setNama_tujuan(tuja.getNama_tujuan());
			tempUserPemesanan.setOngkir(tuja.getOngkir());
			
			//tbproduk
			
			Produk prod =  produkRepository.findByIdProduk(loop.getIdProduk());
			
			tempUserPemesanan.setHarga(prod.getHarga());
			
			dtoPemesanan1.add(tempUserPemesanan);
		}
		
		
		return dtoPemesanan1;
	}
		@Override
		public byte[] generatePemesanan() throws IOException, JRException {
			InputStream filePath = new ClassPathResource("/templates/invoice.jrxml").getInputStream();
			
			List<Pemesanan> dsPemesanan = findAll();
			
			JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(dsPemesanan);
			
			JasperReport report = JasperCompileManager.compileReport(filePath);
			
			JasperPrint print = JasperFillManager.fillReport(report, null,ds);
			
			byte[]  byteArr = JasperExportManager.exportReportToPdf(print);
			
			return byteArr;
		}
	}

	