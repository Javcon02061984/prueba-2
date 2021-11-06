package mintic.LaGenerica.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import mintic.LaGenerica.model.Usuario;

public interface UsuarioDAO extends MongoRepository<Usuario, String>{
		
}
