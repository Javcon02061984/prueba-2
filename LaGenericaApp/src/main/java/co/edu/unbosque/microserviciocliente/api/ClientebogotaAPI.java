package co.edu.unbosque.microserviciocliente.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.microserviciocliente.dao.ClientebogotaDAO;
import co.edu.unbosque.microserviciocliente.model.Clientebogota;
import co.edu.unbosque.microserviciosusuario.dao.UsuariobogotaDAO;
import co.edu.unbosque.microserviciosusuario.model.Usuariobogota;

import java.math.BigInteger;
import java.util.List;

public class ClientebogotaAPI {

	@RestController // esta es una clase REST
	@RequestMapping("db_usuarios")
	public class ClientesAPI {
		@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
		private ClientebogotaDAO clientebogotaDAO;

		@PostMapping("/guardar")
		public void guardar(@RequestBody Clientebogota clientebogota) {
			clientebogotaDAO.save(clientebogota);
		}
		// Request convierte en un objeto Java

		@GetMapping("/listar")
		public List<Clientebogota> listar() {
			return clientebogotaDAO.findAll();
		}
		
		@DeleteMapping("/eliminar/{cedula_usuario}")
		public void eliminar(@PathVariable("cedula_cliente") BigInteger cedula_cliente) {
			clientebogotaDAO.deleteById(cedula_cliente);
		}

		@PutMapping("/actualizar")
		public void actualizar(@RequestBody Clientebogota clientebogota) {
			clientebogotaDAO.save(clientebogota);
		}
		
		@GetMapping("/buscarCliente")
		public String main(String args[]) {
		String clientebogota = toString();
	    	return clientebogota;
		}
	  
		/**@Override
		public String toString() {
	    return "Cliente" + "clientebogota" + ".";
	  } **/

	}
}