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
import co.edu.unbosque.microserviciosusuario.dao.UsuariobogotaDAO;
import co.edu.unbosque.microserviciosusuario.model.Usuariobogota;

import java.math.BigInteger;
import java.util.List;

public class UsuariobogotaAPI {

	@RestController // esta es una clase REST
	@RequestMapping("db_usuarios")
	public class UsuariosAPI {
		@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
		private UsuariobogotaDAO usuariobogotaDAO;

		@PostMapping("/guardar")
		public void guardar(@RequestBody Usuariobogota usuariobogota) {
			usuariobogotaDAO.save(usuariobogota);
		}
		// Request convierte en un objeto Java

		@GetMapping("/listar")
		public List<Usuariobogota> listar() {
			return usuariobogotaDAO.findAll();
		}
		
		@DeleteMapping("/eliminar/{cedula_usuario}")
		public void eliminar(@PathVariable("cedula_usuario") BigInteger cedula_usuario) {
			usuariobogotaDAO.deleteById(cedula_usuario);
		}

		@PutMapping("/actualizar")
		public void actualizar(@RequestBody Usuariobogota usuariobogota) {
			usuariobogotaDAO.save(usuariobogota);
		}
		
		@GetMapping("/buscarUsuario")
		public String main(String args[]) {
		String usuariobogota = toString();
	    	return usuariobogota;
		}
	  
		/**@Override
		public String toString() {
	    return "Usuario" + "usuariobogota" + ".";
	  } **/

	}
}