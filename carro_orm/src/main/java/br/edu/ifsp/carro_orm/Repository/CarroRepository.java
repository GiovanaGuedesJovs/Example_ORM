package br.edu.ifsp.carro_orm.Repository;

import org.springframework.data.repository.CrudRepository;
import br.edu.ifsp.carro_orm.Model.Carro;

public interface CarroRepository extends CrudRepository<Carro, Long> {
    
}
