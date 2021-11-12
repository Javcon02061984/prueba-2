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

import co.edu.unbosque.microserviciocliente.dao.ClientemedellinDAO;
import co.edu.unbosque.microserviciocliente.model.Clientemedellin;

import java.math.BigInteger;
import java.util.List;

public class ClientemedellinAPI {

	@RestController // esta es una clase REST
	@RequestMapping("db_clientes")
	public class ClientesAPI {
		@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
		private ClientemedellinDAO clientemedellinDAO;

		@PostMapping("/guardar")
		public void guardar(@RequestBody Clientemedellin clientemedellin) {
			clientemedellinDAO.save(clientemedellin);
		}
		// Request convierte en un objeto Java

		@GetMapping("/listar")
		public List<Clientemedellin> listar() {
			return clientemedellinDAO.findAll();
		}
		
		@DeleteMapping("/eliminar/{cedula_cliente}")
		public void eliminar(@PathVariable("cedula_cliente") BigInteger cedula_cliente) {
			clientemedellinDAO.deleteById(cedula_cliente);
		}

		@PutMapping("/actualizar")
		public void actualizar(@RequestBody Clientemedellin clientemedellin) {
			clientemedellinDAO.save(clientemedellin);
		}
		
		@GetMapping("/buscarCliente")
		public String main(String args[]) {
		String clientemedellin = toString();
	    	return clientemedellin;
		}
	  
		/**@Override
		public String toString() {
	    return "Cliente" + "clientemedellin" + ".";
	  } **/

	}
}