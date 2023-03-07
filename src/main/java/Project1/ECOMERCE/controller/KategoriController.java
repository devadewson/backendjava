package Project1.ECOMERCE.controller;

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

import Project1.ECOMERCE.Service.KategoriService;
import Project1.ECOMERCE.model.KategoriModel;

@RestController
@CrossOrigin
@RequestMapping("api/project1/kategori")

public class KategoriController {
	@Autowired
	KategoriService kategoriservice;

	@GetMapping
	public List<KategoriModel> findAll() {
		return kategoriservice.findAll();

	}

	@PostMapping
	public String reqKategori(@RequestBody KategoriModel req) {

		return kategoriservice.reqKategori(req);

	}
	@PutMapping
	public String updKategori(@RequestBody KategoriModel req) {

		return kategoriservice.updKategori(req);
	}
	
	@DeleteMapping("{id_kategori}")
	public String delKategori(@PathVariable String id_kategori) {
	return kategoriservice.delKategori(id_kategori);
}

	
	
}
