package Project1.ECOMERCE.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Project1.ECOMERCE.model.Tujuan;

public interface TujuanRepository extends JpaRepository<Tujuan, String> {

	
	public Tujuan findByIdTujuan(String idTujuan);
}
