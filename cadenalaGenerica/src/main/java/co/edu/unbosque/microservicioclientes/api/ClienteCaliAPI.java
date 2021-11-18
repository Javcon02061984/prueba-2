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

import co.edu.unbosque.microservicioclientes.dao.ClienteCaliDAO;
import co.edu.unbosque.microservicioclientes.model.ClienteCali;

@RestController // esta es una clase REST
@RequestMapping("clientes_cali")
public class ClienteCaliAPI {
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private ClienteCaliDAO clienteCaliDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody ClienteCali clienteCali) {
		clienteCaliDAO.save(clienteCali);
	}

	// Request convierte en un objeto Java
	@GetMapping("/listar")
	public List<ClienteCali> listar() {
		return clienteCaliDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") BigInteger id) {
		clienteCaliDAO.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody ClienteCali clienteCali) {
		clienteCaliDAO.save(clienteCali);
	}

	@GetMapping("/buscar/{Id}")
	public ClienteCali findById(@PathVariable BigInteger Id) {
		return clienteCaliDAO.findById(Id).get();
	}

}
