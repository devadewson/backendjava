package Project1.ECOMERCE.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import Project1.ECOMERCE.model.Produk;
import Project1.ECOMERCE.model.Tujuan;

public interface ProdukRepository extends JpaRepository<Produk, String>{
	
	public Produk findByIdProduk(String idProduk);

	
}
