package pe.edu.cibertec.appbasedatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.appbasedatos.models.bd.Estado;
@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {
	
		
	
}
