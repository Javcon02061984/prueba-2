package co.edu.unbosque.microservicioclientes.api;

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

import co.edu.unbosque.microservicioclientes.dao.ClienteMedellinDAO;
import co.edu.unbosque.microservicioclientes.model.ClienteMedellin;

@RestController // esta es una clase REST
@RequestMapping("clientes_medellin")
public class ClienteMedellinAPI {
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private ClienteMedellinDAO clienteMedellinDAO ;

	@PostMapping("/guardar")
	public void guardar(@RequestBody ClienteMedellin clienteMedellin ) {
	clienteMedellinDAO.save( clienteMedellin );
	}

	// Request convierte en un objeto Java
	@GetMapping("/listar")
	public List< ClienteMedellin > listar() {
	return clienteMedellinDAO.findAll();
	}
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") BigInteger id) {
	clienteMedellinDAO.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody ClienteMedellin clienteMedellin ) {
	clienteMedellinDAO.save(clienteMedellin);
	}
	@GetMapping("/buscar/{Id}")
	public ClienteMedellin findById(@PathVariable BigInteger Id){
	return clienteMedellinDAO.findById(Id).get();
	}

}
