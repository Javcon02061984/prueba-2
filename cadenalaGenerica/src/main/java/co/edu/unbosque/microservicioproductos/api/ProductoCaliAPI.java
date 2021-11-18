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

import co.edu.unbosque.microservicioproductos.dao.ProductoCaliDAO;
import co.edu.unbosque.microservicioproductos.model.ProductoCali;

@RestController // esta es una clase REST
@RequestMapping("productos_cali")
public class ProductoCaliAPI {
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private ProductoCaliDAO productoCaliDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody ProductoCali productoCali) {
			productoCaliDAO.save(productoCali);
		}
		
	// Request convierte en un objeto Java
	@GetMapping("/listar")
	public List<ProductoCali> listar() {
		return productoCaliDAO.findAll();
	}
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") BigInteger id) {
		productoCaliDAO.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody ProductoCali productoCali) {
		productoCaliDAO.save(productoCali);
	}
	@GetMapping("/buscar/{Id}")
	public ProductoCali findById(@PathVariable BigInteger Id){
		return productoCaliDAO.findById(Id).get();
	}
}
