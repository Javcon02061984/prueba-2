package mintic.LaGenerica.DAO;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import lombok.Data;
import mintic.LaGenerica.model.Usuario;

public interface UsuarioDAO extends MongoRepository<Usuario, Long> {

}
