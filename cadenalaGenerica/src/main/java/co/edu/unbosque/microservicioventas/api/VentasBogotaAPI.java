package co.edu.unbosque.microservicioventas.api;

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

import co.edu.unbosque.microservicioventas.dao.VentasBogotaDAO;
import co.edu.unbosque.microservicioventas.model.VentasBogota;

@RestController // esta es una clase REST
@RequestMapping("ventas_bogota")
public class VentasBogotaAPI {
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private VentasBogotaDAO ventasBogotaDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody VentasBogota ventasBogota) {
		ventasBogotaDAO.save(ventasBogota);
	}

	// Request convierte en un objeto Java
	@GetMapping("/listar")
	public List<VentasBogota> listar() {
		return ventasBogotaDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") BigInteger id) {
		ventasBogotaDAO.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody VentasBogota ventasBogota) {
		ventasBogotaDAO.save(ventasBogota);
	}

	@GetMapping("/buscar/{Id}")
	public VentasBogota findById(@PathVariable BigInteger Id) {
		return ventasBogotaDAO.findById(Id).get();
	}

}
