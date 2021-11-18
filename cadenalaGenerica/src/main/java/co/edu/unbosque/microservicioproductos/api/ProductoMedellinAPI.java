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

import co.edu.unbosque.microservicioproductos.dao.ProductoMedellinDAO;
import co.edu.unbosque.microservicioproductos.model.ProductoMedellin;

@RestController // esta es una clase REST
@RequestMapping("productos_medellin")
public class ProductoMedellinAPI {
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private ProductoMedellinDAO productoMedellinDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody ProductoMedellin productoMedellin) {
		productoMedellinDAO.save(productoMedellin);
	}

	// Request convierte en un objeto Java
	@GetMapping("/listar")
	public List<ProductoMedellin> listar() {
		return productoMedellinDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") BigInteger id) {
		productoMedellinDAO.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody ProductoMedellin productoMedellin) {
		productoMedellinDAO.save(productoMedellin);
	}

	@GetMapping("/buscar/{Id}")
	public ProductoMedellin findById(@PathVariable BigInteger Id) {
		return productoMedellinDAO.findById(Id).get();
	}

}
