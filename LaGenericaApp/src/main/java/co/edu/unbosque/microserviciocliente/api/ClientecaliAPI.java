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

import co.edu.unbosque.microserviciocliente.dao.ClientecaliDAO;
import co.edu.unbosque.microserviciocliente.model.Clientecali;

import java.math.BigInteger;
import java.util.List;

public class ClientecaliAPI {

	@RestController // esta es una clase REST
	@RequestMapping("db_clientes")
	public class UsuariosAPI {
		@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
		private ClientecaliDAO clientecaliDAO;

		@PostMapping("/guardar")
		public void guardar(@RequestBody Clientecali clientecali) {
			clientecaliDAO.save(clientecali);
		}
		// Request convierte en un objeto Java

		@GetMapping("/listar")
		public List<Clientecali> listar() {
			return clientecaliDAO.findAll();
		}
		
		@DeleteMapping("/eliminar/{cedula_cliente}")
		public void eliminar(@PathVariable("cedula_cliente") BigInteger cedula_cliente) {
			clientecaliDAO.deleteById(cedula_cliente);
		}

		@PutMapping("/actualizar")
		public void actualizar(@RequestBody Clientecali clientecali) {
			clientecaliDAO.save(clientecali);
		}
		
		@GetMapping("/buscarCliente")
		public String main(String args[]) {
		String clientecali = toString();
	    	return clientecali;
		}
	  
		/**@Override
		public String toString() {
	    return "Cliente" + "clientecali" + ".";
	  } **/

	}
}