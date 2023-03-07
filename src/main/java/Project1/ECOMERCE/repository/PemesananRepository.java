package Project1.ECOMERCE.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Project1.ECOMERCE.model.Pemesanan;

public interface PemesananRepository extends JpaRepository<Pemesanan, String> {



public List<Pemesanan>  findByIdPemesanan(String idPemesanan);
}
