package practica01.dao;

import practica01.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoDao extends JpaRepository<Estado, Long>  {
    
    
    
}
