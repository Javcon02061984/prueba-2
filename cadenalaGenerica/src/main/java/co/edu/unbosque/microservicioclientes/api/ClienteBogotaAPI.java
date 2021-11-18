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

import co.edu.unbosque.microservicioclientes.dao.ClienteBogotaDAO;
import co.edu.unbosque.microservicioclientes.model.ClienteBogota;

@RestController // esta es una clase REST
@RequestMapping("clientes_bogota")
public class ClienteBogotaAPI {
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private ClienteBogotaDAO clienteBogotaDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody ClienteBogota clienteBogota) {
		clienteBogotaDAO.save(clienteBogota);
	}

	// Request convierte en un objeto Java
	@GetMapping("/listar")
	public List<ClienteBogota> listar() {
		return clienteBogotaDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") BigInteger id) {
		clienteBogotaDAO.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody ClienteBogota clienteBogota) {
		clienteBogotaDAO.save(clienteBogota);
	}

	@GetMapping("/buscar/{Id}")
	public ClienteBogota findById(@PathVariable BigInteger Id) {
		return clienteBogotaDAO.findById(Id).get();
	}

}
