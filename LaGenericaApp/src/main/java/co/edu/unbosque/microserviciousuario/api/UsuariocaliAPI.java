package co.edu.unbosque.microserviciousuario.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.microserviciosusuario.dao.UsuariocaliDAO;
import co.edu.unbosque.microserviciosusuario.model.Usuariocali;

import java.math.BigInteger;
import java.util.List;

public class UsuariocaliAPI {

	@RestController // esta es una clase REST
	@RequestMapping("db_usuarios")
	public class UsuariosAPI {
		@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
		private UsuariocaliDAO usuariocaliDAO;

		@PostMapping("/guardar")
		public void guardar(@RequestBody Usuariocali usuariocali) {
			usuariocaliDAO.save(usuariocali);
		}
		// Request convierte en un objeto Java

		@GetMapping("/listar")
		public List<Usuariocali> listar() {
			return usuariocaliDAO.findAll();
		}
		
		@DeleteMapping("/eliminar/{cedula_usuario}")
		public void eliminar(@PathVariable("cedula_usuario") BigInteger cedula_usuario) {
			usuariocaliDAO.deleteById(cedula_usuario);
		}

		@PutMapping("/actualizar")
		public void actualizar(@RequestBody Usuariocali usuariocali) {
			usuariocaliDAO.save(usuariocali);
		}
		
		@GetMapping("/buscarUsuario")
		public String main(String args[]) {
		String usuariocali = toString();
	    	return usuariocali;
		}
	  
		/**@Override
		public String toString() {
	    return "Usuario" + "usuariocali" + ".";
	  } **/
	}
}