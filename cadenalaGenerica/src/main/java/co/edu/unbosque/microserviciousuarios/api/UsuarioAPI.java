package co.edu.unbosque.microserviciousuarios.api;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.microserviciousuarios.dao.UsuarioDAO;
import co.edu.unbosque.microserviciousuarios.model.Usuario;

@RestController // esta es una clase REST
@RequestMapping("usuarios")
public class UsuarioAPI {
	
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private UsuarioDAO usuarioDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody Usuario usuario) {
		usuarioDAO.save(usuario);
	}
	// Request convierte en un objeto Java

	@GetMapping("/listar")
	public List<Usuario> listar() {
		return usuarioDAO.findAll();
	}
	@DeleteMapping("/eliminar/{cedula_usuario}")
	public void eliminar(@PathVariable("cedula_usuario") BigInteger cedula_usuario) {
		usuarioDAO.deleteById(cedula_usuario);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuario usuario) {
		usuarioDAO.save(usuario);
	}
	@GetMapping("/buscar/{Id}")
	public Usuario findById(@PathVariable BigInteger Id){
		return usuarioDAO.findById(Id).get();
	}
}
