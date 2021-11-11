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
	
	@PutMapping("{cedula_usuario}")
	Usuario update(@PathVariable Long cedula_usuario, @RequestBody Usuario usuario) {

		Usuario usuarioFromDB = usuarioRepository
				.findById(cedula_usuario)
				.orElseThrow(RuntimeException::new);
		
		usuarioFromDB.setCedula_usuario(usuario.getCedula_usuario());
		usuarioFromDB.setNombre_usuario(usuario.getNombre_usuario());
		usuarioFromDB.setSede_usuario(usuario.getSede_usuario());
		usuarioFromDB.isEstado_usuario();
		
		return usuarioRepository.save(usuarioFromDB);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("{cedula_usuario}")
	void delete(@PathVariable Long cedula_usuario) {
		Usuario usuario = usuarioRepository
				.findById(cedula_usuario)
				.orElseThrow(RuntimeException::new);
			
		usuarioRepository.delete(usuario);	
		}
}