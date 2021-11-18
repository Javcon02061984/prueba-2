package co.edu.unbosque.microserviciousuarios.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.microserviciousuarios.api.UsuarioAPI;
import co.edu.unbosque.microserviciousuarios.model.Usuario;

@RestController // esta es una clase REST
@RequestMapping("usuarios")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private UsuarioAPI usuarioAPI;
	
	@PostMapping("/guardar")
	public ResponseEntity<Usuario> guardar(@RequestBody Usuario usuario) {
		Usuario obj = usuarioAPI.save(usuario);
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}
	// Request convierte en un objeto Java

	@GetMapping("/listar")
	public List<Usuario> getAll() {
		return usuarioAPI.getAll();
	}
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Usuario> eliminar(@PathVariable BigInteger id) {
		Usuario usuario = usuarioAPI.get(id);
		if (usuario != null) {
			usuarioAPI.delete(id);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(usuario, HttpStatus.OK);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
		Usuario obj = usuarioAPI.save(usuario);
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}
	
	@GetMapping("/buscarID/{id}")
	public Usuario find(@PathVariable BigInteger id) {
		return usuarioAPI.get(id);
	}
}