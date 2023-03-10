package com.Libreria.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Libreria.Servicios.ServicioAutor;
import com.Libreria.entidades.Autor;

@Controller
@RequestMapping("/autor") // Proporciona el mapeo entre la ruta de la petición y el método del controlador
public class ControladorAutor {
	
	@Autowired
	private ServicioAutor servAutor;
	
                                 //@GetMapping es una anotación compuesta que actúa como un 
        @GetMapping("/registro")  //acceso directo para @RequestMapping (method = RequestMethod.GET).
	public String registroAutor(ModelMap model) {
		model.addAttribute("registro", "Cargar Autor");
		return "/autores/registroAutor";
	}

	@PostMapping("/registro") //Post: envío info // Acá tiene que ir al registro (cuando haga la acción)
	public String nuevoAutor(ModelMap model, @RequestParam("nombre") String nombre) {
		try {
			servAutor.crearAutor(nombre);
			return ("redirect:/autor/lista"); // acá crea el autor y le indico que vuelva a mi pág ppal.
		} catch (Exception e) {
			model.put("error", "Error al ingresar nombre");
			return registroAutor(model);
		}

	}
	
	@GetMapping("/lista")
	public String listar(ModelMap modelo) {
		List<Autor> listaAut=servAutor.listarAutor();
		modelo.addAttribute("listaAutores",listaAut);
		return "/autores/listaAutor.html";
	}
	
	@PostMapping("/lista")
	public String buscarName(@RequestParam String nombre) {
		Autor a = servAutor.findName(nombre);
		System.out.println(a.getNombre()+" con id "+a.getId());
		return "reditect:/autor/lista";
		
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable int id) {
		
		servAutor.eliminarAutor(id);
		return "redirect:/autor/lista";
	}
	
	@GetMapping("/editar/{id}")
	public String viewEditar(ModelMap model,@PathVariable int id) {
		Autor aut = servAutor.listAut(id);
		model.addAttribute("autor", aut);
		model.put("editar", "Editar Autor");
			return "/autores/registroAutor";
	}
	
	@PostMapping("/editar/{id}")
	public String editar(ModelMap model, @PathVariable int id,@RequestParam String nombre) {
		try {
			servAutor.modificarAutor(id, nombre);
			return "redirect:/autor/lista";
		} catch (Exception e) {
			model.put("error", "Error. Al ingresar nombre");
			
			return viewEditar(model, id);
		}
		
	}
	
}
