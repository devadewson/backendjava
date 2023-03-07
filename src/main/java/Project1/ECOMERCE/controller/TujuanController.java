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

import Project1.ECOMERCE.Service.TujuanService;
import Project1.ECOMERCE.model.Tujuan;

@RestController
@RequestMapping("api/project1/tujuan")

public class TujuanController {

	@Autowired
	TujuanService tujuanservice;

	@GetMapping
	public List<Tujuan> findAll() {
		return tujuanservice.findAll();

	}

	@PostMapping
	public String reqTujuan(@RequestBody Tujuan req) {

		return tujuanservice.reqTujuan(req);

	}
	@PutMapping
	public String updTujuan(@RequestBody Tujuan req) {

		return tujuanservice.updTujuan(req);
	}
	
	@DeleteMapping("{idTujuan}")
	public String delTujuan(@PathVariable String idTujuan) {
	return tujuanservice.delTujuan(idTujuan);
}

	
}
