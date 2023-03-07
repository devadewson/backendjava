package Project1.ECOMERCE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project1.ECOMERCE.Service.PembayaranService;
import Project1.ECOMERCE.model.Pembayaran;

@RestController
@RequestMapping("api/project1/pembayaran")

public class PembayaranController {
	@Autowired
	PembayaranService pembayaranservice;

	@GetMapping
	public List<Pembayaran> findAll() {
		return pembayaranservice.findAll();

	}

	@PostMapping
	public String reqPembayaran(@RequestBody Pembayaran req) {

		return pembayaranservice.reqPembayaran(req);

	}
	@PutMapping
	public String updPembayaran(@RequestBody Pembayaran req) {

		return pembayaranservice.updPembayaran(req);
	}
	
	@DeleteMapping("{id_pembayaran}")
	public String delPembayaran(@PathVariable String id_pembayaran) {
	return pembayaranservice.delPembayaran(id_pembayaran);
}

}
