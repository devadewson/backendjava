package Project1.ECOMERCE.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project1.ECOMERCE.DTO.dtopemesanan;
import Project1.ECOMERCE.Service.PemesananService;
import Project1.ECOMERCE.model.Pemesanan;
import net.sf.jasperreports.engine.JRException;

@CrossOrigin
@RestController
@RequestMapping("api/project1/pemesanan")
public class PemesananController {
	@Autowired
	PemesananService pemesananservice;

	@GetMapping
	public List<Pemesanan> findAll() {
		return pemesananservice.findAll();

	}

	@PostMapping
	public String reqPemesanan(@RequestBody Pemesanan req) {

		return pemesananservice.reqPemesanan(req);

	}
	@PutMapping
	public String updPemesanan(@RequestBody Pemesanan req) {

		return pemesananservice.updPemesanan(req);
	}
	
	@DeleteMapping("{idPemesanan}")
	public String delPemesanan(@PathVariable String idPemesanan) {
	return pemesananservice.delPemesanan(idPemesanan);
}
	@PostMapping("/DTO/{idPemesanan}")
	public List<dtopemesanan> getViewByDto (@PathVariable String idPemesanan){
		return pemesananservice.getViewByDto(idPemesanan);
	}
	@PostMapping ("/generatepemesanan")
	public byte[] generatePemesanan() throws IOException, JRException {
		return pemesananservice.generatePemesanan();
	}
}
