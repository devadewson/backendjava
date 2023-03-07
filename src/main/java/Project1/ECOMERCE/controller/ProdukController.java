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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import Project1.ECOMERCE.Service.ProdukService;
import Project1.ECOMERCE.model.Produk;

@RestController
@RequestMapping("api/project1/produk")
@CrossOrigin

public class ProdukController {

	
	@Autowired
	ProdukService produkservice;

	@GetMapping
	public List<Produk> findAll() {
		return produkservice.findAll();

	}

	@PostMapping
	public String reqProduk(@RequestBody Produk req) {

		return produkservice.reqProduk(req);

	}
	@PutMapping
	public String updProduk(@RequestBody Produk req) {

		return produkservice.updProduk(req);
	}
	
	@DeleteMapping("{id_produk}")
	public String delProduk(@PathVariable String id_produk) {
	return produkservice.delProduk(id_produk);
	}
	

	@PostMapping("/gambar/image")
	public String uploadImage( @RequestParam ("image") MultipartFile  file, String id_produk)  throws IOException {
	return produkservice.uploadImage(file,id_produk);
	}
	
	@GetMapping("/idimage/{id_produk}")
	public byte[] getgambarbyid(@PathVariable String id_produk) {
	return produkservice.getgambarbyid(id_produk);	
	}
	

}

	
	
	



