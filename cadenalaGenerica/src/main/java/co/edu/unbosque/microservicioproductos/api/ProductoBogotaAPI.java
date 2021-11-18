package co.edu.unbosque.microservicioproductos.api;

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

import co.edu.unbosque.microservicioproductos.dao.ProductoBogotaDAO;
import co.edu.unbosque.microservicioproductos.model.ProductoBogota;

@RestController // esta es una clase REST
@RequestMapping("productos_bogota")
public class ProductoBogotaAPI {
	
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private ProductoBogotaDAO productoBogotaDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody ProductoBogota productoBogota) {
		productoBogotaDAO.save(productoBogota);
	}

	// Request convierte en un objeto Java
	@GetMapping("/listar")
	public List<ProductoBogota> listar() {
		return productoBogotaDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") BigInteger id) {
		productoBogotaDAO.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody ProductoBogota productoBogota) {
		productoBogotaDAO.save(productoBogota);
	}

	@GetMapping("/buscar/{Id}")
	public ProductoBogota findById(@PathVariable BigInteger Id) {
		return productoBogotaDAO.findById(Id).get();
	}

}
