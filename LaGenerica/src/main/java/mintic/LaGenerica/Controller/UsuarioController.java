package mintic.LaGenerica.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mintic.LaGenerica.DAO.UsuarioDAO;
import mintic.LaGenerica.model.Usuario;

@CrossOrigin
@RestController
@RequestMapping("/LaGenerica")
public class UsuarioController {

	@Autowired
	private UsuarioDAO usuarioRepository;
	
	@GetMapping("")
	List<Usuario> index(){
		return usuarioRepository.findAll();	
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("")	
	Usuario create(@RequestBody Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
	@PutMapping("{id_usuario}")
	Usuario update(@PathVariable String id_usuario, @RequestBody Usuario usuario) {

		Usuario usuarioFromDB = usuarioRepository
			.findById(id_usuario)
			.orElseThrow(RuntimeException::new);
		
		usuarioFromDB.setId_usuario(usuario.getId_usuario());
		usuarioFromDB.setNombre_usuario(usuario.getNombre_usuario());
		
		return usuarioRepository.save(usuarioFromDB);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("{id_usuario}")
	void delete(@PathVariable String id_usuario) {
		Usuario usuario = usuarioRepository
			.findById(id_usuario)
			.orElseThrow(RuntimeException::new);
			
		usuarioRepository.delete(usuario);	
		}
}