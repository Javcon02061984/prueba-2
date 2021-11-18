package co.edu.unbosque.microservicioproveedores.api;

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

import co.edu.unbosque.microservicioproveedores.dao.ProveedorDAO;
import co.edu.unbosque.microservicioproveedores.model.Proveedor;

@RestController
@RequestMapping("proveedores")
public class ProveedorAPI {
	
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private ProveedorDAO proveedorDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody Proveedor proveedor) {
			proveedorDAO.save(proveedor);
		}
		
	// Request convierte en un objeto Java
	@GetMapping("/listar")
	public List<Proveedor> listar() {
		return proveedorDAO.findAll();
	}
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") BigInteger id) {
		proveedorDAO.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Proveedor proveedor) {
		proveedorDAO.save(proveedor);
	}
	@GetMapping("/buscar/{Id}")
	public Proveedor findById(@PathVariable BigInteger Id){
		return proveedorDAO.findById(Id).get();
	}
}
